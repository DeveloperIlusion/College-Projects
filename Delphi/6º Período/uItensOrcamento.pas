unit uItensOrcamento;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls, Vcl.Buttons, Vcl.Mask,
  Vcl.ExtCtrls, Vcl.DBCtrls, uTipoOperacao;

type
  TfrmItensOrcamento = class(TForm)
    tpanel1: TPanel;
    Label1: TLabel;
    Label2: TLabel;
    dbeNome: TDBEdit;
    dbePosicao: TDBEdit;
    btnGravar: TBitBtn;
    btnCancelar: TBitBtn;
    Label3: TLabel;
    dblOrcamento: TDBLookupComboBox;
    dbeValor: TDBEdit;
    dbeObservacao: TDBEdit;
    Label4: TLabel;
    dbeQuantidade: TDBEdit;
    lblValor: TLabel;
    Label5: TLabel;
    procedure FormActivate(Sender: TObject);
    procedure btnCancelarClick(Sender: TObject);
    procedure btnGravarClick(Sender: TObject);
  private
    { Private declarations }
    FTipoOperacao: TTipoOperacao;
    procedure Carregar;
    procedure Gravar;
    procedure Cancelar;
    procedure ValidarDados;
  public
    { Public declarations }
    property TipoOperacao: TTipoOperacao read FTipoOperacao write FTipoOperacao;
  end;

var
  frmItensOrcamento: TfrmItensOrcamento;

implementation

{$R *.dfm}

uses uDM, Data.DB, uFuncoes;

//Define e chama a fun��o que setta o tipo de a��o ao abrirmos o form
procedure TfrmItensOrcamento.Carregar;
begin
  case TipoOperacao of
    topInserir:
    begin
      Caption := 'Inserindo item or�amento';
      uConexao.queryItemOrcamento.Append;
    end;
    topEditar:
    begin
      Caption := 'Editando item or�amento';
      uConexao.queryItemOrcamento.Edit;
    end;
  end;
  dbeNome.SetFocus;
end;

procedure TfrmItensOrcamento.FormActivate(Sender: TObject);
begin
  Carregar;
end;

//Define e setta a fun��o de cancelar o processo e fechar ao query no clique do
//bot�o cancelar.
procedure TfrmItensOrcamento.btnCancelarClick(Sender: TObject);
begin
  Caption := 'Itens Or�amento';
  Cancelar;
end;

procedure TfrmItensOrcamento.Cancelar;
begin
  uConexao.queryItemOrcamento.Cancel;
  Close;
end;

//Define a a��o de grava��o e a valida��o dos dados
procedure TfrmItensOrcamento.Gravar;
begin
  try
    uConexao.queryItemOrcamento.Post;
  except
    Erro('Erro ao gravar dados');
  end;
  uConexao.queryItemOrcamento.Refresh;
  Close;
end;

procedure TfrmItensOrcamento.ValidarDados;
begin
  if (RetornaTipoDeOperacaoDaQuery(uConexao.queryItemOrcamento) = topNavegar) then
  begin
    Alerta('N�o foi definida se a opera��o � de inser��o ou edi��o');
    Abort;
  end;
  if dbeNome.Text = EmptyStr then
  begin
    Alerta('Preencha o nome');
    dbeNome.SetFocus;
    Abort;
  end;
  if dbePosicao.Text = EmptyStr then
  begin
    Alerta('Preencha o posi��o');
    dbePosicao.SetFocus;
    Abort;
  end;
  if dbeValor.Text = EmptyStr then
  begin
    Alerta('Preencha o valor');
    dbeValor.SetFocus;
    Abort;
  end;
  if dbeObservacao.Text = EmptyStr then
  begin
    Alerta('Preencha a oberva��o');
    dbeObservacao.SetFocus;
    Abort;
  end;
  if dbeQuantidade.Text = EmptyStr then
  begin
    Alerta('Preencha a quantidade');
    dbeQuantidade.SetFocus;
    Abort;
  end;
end;

procedure TfrmItensOrcamento.btnGravarClick(Sender: TObject);
begin
  ValidarDados;
  Gravar;
end;

end.
