using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Prova
{
    public partial class Prova_Form : System.Web.UI.Page
    {
        public void CarregarDados()
        {
            MySqlConnection con = new MySqlConnection(@"Server=127.0.01;user=root;password=12345678;database=ads");
            con.Open();
            MySqlCommand comando = new MySqlCommand("SELECT c.CodCliente, c.Nome, c.CPF, c.Identidade from cliente c", con);
            MySqlDataReader dr = comando.ExecuteReader();

            gvDados.DataSource = dr;
            gvDados.DataBind();
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                CarregarDados();
            }
        }

        public bool InserirCliente(Cliente c)
        {
            MySqlConnection con = new MySqlConnection(@"Server=127.0.01;user=root;password=12345678;database=ads");
            con.Open();
            MySqlCommand comando = new MySqlCommand("INSERT INTO cliente(Nome, CPF, Identidade) VALUES (@Nome, @CPF, @Identidade)", con);

            comando.Parameters.AddWithValue("@Nome", c.Nome);
            comando.Parameters.AddWithValue("@CPF", c.CPF);
            comando.Parameters.AddWithValue("@Identidade", c.Identidade);

            MySqlDataReader dr = comando.ExecuteReader();

            return dr.RecordsAffected > 0;
        }
        protected void btnInserir_Click(object sender, EventArgs e)
        {
            Cliente c = new Cliente();
            c.Nome = txtNome.Text;
            c.CPF = txtCPF.Text;
            c.Identidade = txtIdentidade.Text;

            if (InserirCliente(c))
            {
                lblRetornoOperacao.Text = "Cliente adicionado com sucesso.";
                txtCodCliente.Text = "";
                txtNome.Text = "";
                txtCPF.Text = "";
                txtIdentidade.Text = "";
            }
            else
            {
                lblRetornoOperacao.Text = "Não foi possível adicionar o cliente.";
            };
            CarregarDados();
        }

        public bool EditarCliente(Cliente c)
        {
            MySqlConnection con = new MySqlConnection(@"Server=127.0.01;user=root;password=12345678;database=ads");
            con.Open();
            MySqlCommand comando = new MySqlCommand("UPDATE cliente SET Nome = @Nome, CPF = @CPF, Identidade = @Identidade WHERE (CodCliente = @CodCliente)", con);

            comando.Parameters.AddWithValue("@CodCliente", c.CodCliente);
            comando.Parameters.AddWithValue("@Nome", c.Nome);
            comando.Parameters.AddWithValue("@CPF", c.CPF);
            comando.Parameters.AddWithValue("@Identidade", c.Identidade);

            MySqlDataReader dr = comando.ExecuteReader();

            return dr.RecordsAffected > 0;
        }
        protected void btnEditar_Click(object sender, EventArgs e)
        {
            Cliente c = new Cliente();
            c.CodCliente = int.Parse(txtCodCliente.Text);
            c.Nome = txtNome.Text;
            c.CPF = txtCPF.Text;
            c.Identidade = txtIdentidade.Text;


            if (EditarCliente(c))
            {
                lblRetornoOperacao.Text = "Cliente editado com sucesso.";
                txtCodCliente.Text = "";
                txtNome.Text = "";
                txtCPF.Text = "";
                txtIdentidade.Text = "";
            }
            else
            {
                lblRetornoOperacao.Text = "Não foi possível editar o cliente.";
            };
            CarregarDados();
        }

        public bool ExcluirCliente(Cliente c)
        {
            MySqlConnection con = new MySqlConnection(@"Server=127.0.01;user=root;password=12345678;database=ads");
            con.Open();
            MySqlCommand comando = new MySqlCommand("DELETE from cliente WHERE CodCliente = @CodCliente", con);

            comando.Parameters.AddWithValue("@CodCliente", c.CodCliente);

            MySqlDataReader dr = comando.ExecuteReader();

            return dr.RecordsAffected > 0;
        }

        protected void btnExcluir_Click(object sender, EventArgs e)
        {
            Cliente c = new Cliente();
            c.CodCliente = int.Parse(txtCodCliente.Text);


            if (ExcluirCliente(c))
            {
                lblRetornoOperacao.Text = "Cliente excluído com sucesso.";
                txtCodCliente.Text = "";
                txtNome.Text = "";
                txtCPF.Text = "";
                txtIdentidade.Text = "";
            }
            else
            {
                lblRetornoOperacao.Text = "Não foi possível excluír o cliente.";
            };
            CarregarDados();
        }

        protected void btnAtualizar_Click(object sender, EventArgs e)
        {
            CarregarDados();
        }
    }
}