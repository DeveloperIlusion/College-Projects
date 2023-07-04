<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Prova-Form.aspx.cs" Inherits="Prova.Prova_Form" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            height: 26px;
        }
        .auto-style2 {
            width: 31px;
            height: 23px;
        }
        .auto-style3 {
            height: 26px;
            width: 31px;
        }
        .auto-style4 {
            height: 23px;
        }
        .auto-style5 {
            height: 23px;
            width: 55px;
        }
        .auto-style6 {
            height: 26px;
            width: 55px;
        }
        .auto-style7 {
            width: 55px;
        }
        .auto-style8 {
            margin-left: 5px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
        <asp:Label ID="lblResultado" runat="server" BackColor="#FFFF99" Font-Bold="True" ForeColor="Red"></asp:Label>
        <asp:GridView ID="gvDados" runat="server" BackColor="White" BorderColor="#999999" BorderStyle="Solid" BorderWidth="1px" CellPadding="3" ForeColor="Black" GridLines="Vertical">
            <AlternatingRowStyle BackColor="#CCCCCC" />
            <FooterStyle BackColor="#CCCCCC" />
            <HeaderStyle BackColor="Black" Font-Bold="True" ForeColor="White" />
            <PagerStyle BackColor="#999999" ForeColor="Black" HorizontalAlign="Center" />
            <SelectedRowStyle BackColor="#000099" Font-Bold="True" ForeColor="White" />
            <SortedAscendingCellStyle BackColor="#F1F1F1" />
            <SortedAscendingHeaderStyle BackColor="#808080" />
            <SortedDescendingCellStyle BackColor="#CAC9C9" />
            <SortedDescendingHeaderStyle BackColor="#383838" />
        </asp:GridView>
        <table>
            <tr>
                <td class="auto-style5"><asp:Label ID="lblCodCliente" Text="Cód." runat="server"></asp:Label></td>
                <td class="auto-style4"><asp:Label ID="lblNome" Text="Cliente" runat="server" style="position: relative"></asp:Label></td>
                <td class="auto-style4"><asp:Label ID="lblCPF" Text="CPF" runat="server"></asp:Label></td>
                <td class="auto-style4"><asp:Label ID="lblIdentidade" Text="Identidade" runat="server" style="position: relative"></asp:Label></td>
                <td class="auto-style2"></td>
                <td class="auto-style4"></td>
                <td class="auto-style4"></td>
            </tr>
            <tr>
                <td class="auto-style6"><asp:TextBox ID="txtCodCliente" Width="28px" runat="server"></asp:TextBox></td>
                <td class="auto-style1"><asp:TextBox ID="txtNome" Width="350" runat="server" CssClass="auto-style8"></asp:TextBox></td>
                <td class="auto-style1"><asp:TextBox ID="txtCPF" Width="60" runat="server"></asp:TextBox></td>
                <td class="auto-style1"><asp:TextBox ID="txtIdentidade" Width="100" runat="server" style="position: relative; top: 0px; left: 2px"></asp:TextBox></td>
                <td class="auto-style3">&nbsp;</td>
                <td class="auto-style1">&nbsp;</td>
                <td class="auto-style1">&nbsp;</td>
            </tr>
            <tr>
                <td class="auto-style7"><asp:Button ID="btnInserir" text="Inserir" runat="server" OnClick="btnInserir_Click"></asp:Button></td>
                <td><asp:Button ID="btnEditar" text="Editar" runat="server" OnClick="btnEditar_Click"></asp:Button></td>
                <td><asp:Button ID="btnExcluir" text="Excluir" runat="server" OnClick="btnExcluir_Click"></asp:Button></td>
                <td><asp:Button ID="btnAtualizar" text="Atualizar" runat="server" OnClick="btnAtualizar_Click" style="height: 26px"></asp:Button></td>
            </tr>
            <tr>
                <td colspan="4"><asp:Label ID="lblRetornoOperacao" text="" Font-Bold="true" runat="server"></asp:Label></td>
            </tr>
        </table>
    </form>
</body>
</html>
