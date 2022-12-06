<?php

    class Database 
    {
        private static $dbdrive  = "";
        private static $host     = "";
        private static $port     = "";
        private static $user     = "";
        private static $password = "";
        private static $db       = "";        

        public function __construct( $db_dbdrive = DB_DRIVE, $db_host = DB_HOST, $db_port = DB_PORT, 
                                        $db_user = DB_USER, $db_password = DB_PASSWORD, $db_bdados = DB_BDADOS )
        {
            self::$dbdrive  = $db_dbdrive;
            self::$host     = $db_host;
            self::$port     = $db_port;
            self::$user     = $db_user;
            self::$password = $db_password;
            self::$db       = $db_bdados;  
        }

        private function __clone() {
            
        }

        public function __destruct() {
            $this->disconnect();
            foreach ($this as $key => $value) {
                unset($this->$key);
            }
        }

        private function getDBDrive() {return self::$dbdrive;}
        private function getHost()    {return self::$host;}
        private function getPort()    {return self::$port;}
        private function getUser()    {return self::$user;}
        private function getPassword(){return self::$password;}
        private function getDB()      {return self::$db;}

        public  function connect()
        {  
            try {
                if ( $this->getDBDrive() == 'mysql' ) {           
                    $this->conexao = new PDO($this->getDBDrive().":host=".$this->getHost().";port=".$this->getPort().";dbname=".$this->getDB(), $this->getUser(), $this->getPassword());
                } else if ( $this->getDBDrive() == 'sqlsrv' ) {   
                    $this->conexao = new PDO($this->getDBDrive().":Server=".$this->getHost().",".$this->getPort().";DataBase=".$this->getDB(), $this->getUser(), $this->getPassword());
                }

            } catch (PDOException $i) {
                die("Erro: <code>" . $i->getMessage() . "</code>");
            }

            return ($this->conexao);
            
        }

        private function disconnect(){
            $this->conexao = null;
        }

        /**
         * Método select que retorna um array de objetos
        *   @param string $sql
        *   @param array $params
        *   @return void
         */
        
        public function dbSelect( $sql , $params = null )
        {
            if ((gettype($params) != 'array') && (gettype($params) != "NULL") ) {
                $params = [$params];
            }
            
            $query = $this->connect()->prepare( $sql , array( PDO::ATTR_CURSOR => PDO::CURSOR_SCROLL ) );
            $query->execute( $params );
            $rs = $query;
            
            self::__destruct();
            
            return $rs;
            
        }
        
        public function dbInsert( $sql , $params = null )
        {
            try {        
                $conexao = $this->connect();
                $query   = $conexao->prepare( $sql );
                $query->execute( $params );
                
                $rs      = $conexao->lastInsertId();
                
                self::__destruct();
                
                return $rs;

            } catch (Exception $e) {
                echo 'Exceção capturada: '.  $e->getMessage(); exit;
            }         
        }
        
        public function dbUpdate( $sql , $params = null )
        {
                
            $query=$this->connect()->prepare($sql);
            $query->execute($params);
                        
            $rs = $query->rowCount() or die(print_r($query->errorInfo(), true));
            self::__destruct();            
            
            return $rs;
            
        }

        public function dbDelete($sql,$params=null)
        {
            
            $query=$this->connect()->prepare($sql);
            
            try {
                
                $query->execute($params);
                $rs = $query->rowCount(); 
                
            } catch (Exception $exc) {
                echo "Erro ao Excluir Registro, favor entrar em contato com Suporte Tenico" . $exc->getTraceAsString();
            }

            self::__destruct();
            
            if ($rs == array()) {
                return false;
            } else {
                return $rs;
            }
            
            
        }

        public function dbBuscaDados( $rscPdo )
        {
            return $rscPdo->fetch(PDO::FETCH_OBJ);
        }
        
        public function dbBuscaDadosAll( $rscPdo )
        {
            return $rscPdo->fetchAll(PDO::FETCH_OBJ);
        }
        
        public function dbBuscaArray( $rscPdo )
        {
            return $rscPdo->fetch(PDO::FETCH_ASSOC);
        }

        public function dbBuscaArrayAll( $rscPdo )
        {
            return $rscPdo->fetchall(PDO::FETCH_ASSOC);
        }
        
        public function dbNumeroLinhas( $rscPdo )
        {
            return $rscPdo->rowCount();
        }

        public function dbNumeroColunas( $rscPdo )
        {
            return $rscPdo->columnCount();
        }            
        
        public function dbResultado( $rscRes , $CampoRetorno )
        {
            $rowResX = $this->dbBuscaArray( $rscRes );
            
            return $rowResX[ $CampoRetorno ];
        }

    }