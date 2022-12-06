<?php

class ModelBase
{
    /**
     * conectaDb
     *
     * @return object
     */
    public function conectaDb()
    {
        return new Database(
            DB_DRIVE,
            DB_HOST,
            DB_PORT,
            DB_USER,
            DB_PASSWORD,
            DB_BDADOS
        );
    }
}