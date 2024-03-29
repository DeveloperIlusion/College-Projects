unit uListarOrcamento;

interface

uses
  Winapi.Windows, Winapi.Messages, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.ExtCtrls, Data.DB, Vcl.StdCtrls,
  Vcl.Buttons, Vcl.Grids, Vcl.DBGrids, uTipoOperacao, uOrcamento;

type
  TfrmListarOrcamento = class(TForm)
    Panel1: TPanel;
    dbgListarOrcamento: TDBGrid;
    Panel2: TPanel;
    btnExcluir: TBitBtn;
    btnEditar: TBitBtn;
    btnInserir: TBitBtn;
    procedure FormActivate(Sender: TObject);
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
    procedure dbgListarOrcamentoDblClick(Sender: TObject);
    procedure dbgListarOrcamentoDrawColumnCell(Sender: TObject; const Rect: TRect;
      DataCol: Integer; Column: TColumn; State: TGridDrawState);
    procedure btnInserirClick(Sender: TObject);
    procedure btnEditarClick(Sender: TObject);
    procedure btnExcluirClick(Sender: TObject);
  private
    procedure Excluir;
    procedure ControlarVisibilidadeDosBotoes;
    procedure AbrirCadastro(const pTipoOperacao: TTipoOperacao);
  public
    { Public declarations }
  end;

var
  frmListarOrcamento: TfrmListarOrcamento;

implementation

{$R *.dfm}

uses uDM, uFuncoes, System.SysUtils;

  //Define o chamado da opera��o de exclus�o
  procedure TfrmListarOrcamento.Excluir;
  begin
    if uConexao.queryOrcamento.IsEmpty then
      Exit;
    if (not Pergunta('Deseja realmente excluir o or��mento?')) then
      Exit;
    uConexao.queryOrcamento.Delete;
  end;

  procedure TfrmListarOrcamento.btnExcluirClick(Sender: TObject);
  begin
    Excluir;
    ControlarVisibilidadeDosBotoes;
  end;

  //Define o chamado da opera��o de inser��o
  procedure TfrmListarOrcamento.btnInserirClick(Sender: TObject);
  begin
    AbrirCadastro(topInserir);
    ControlarVisibilidadeDosBotoes;
  end;

  //Define o chamado da opera��o de edi��o
  procedure TfrmListarOrcamento.btnEditarClick(Sender: TObject);
  begin
     AbrirCadastro(topEditar);
  end;

//Inicia o formul�rio com os dados e os bot�es controlados ao abrir a tela
  procedure TfrmListarOrcamento.ControlarVisibilidadeDosBotoes;
  begin
    btnEditar.Enabled := (not uConexao.queryOrcamento.IsEmpty);
    btnExcluir.Enabled := (not uConexao.queryOrcamento.IsEmpty);
  end;

  procedure TfrmListarOrcamento.FormActivate(Sender: TObject);
  begin
    AtivarQuery(uConexao.queryOrcamento, topAbrir);
    ControlarVisibilidadeDosBotoes;
  end;

  //Ao encerrar o formul�rio, fecha a query
  procedure TfrmListarOrcamento.FormClose(Sender: TObject; var Action: TCloseAction);
  begin
    AtivarQuery(uConexao.queryOrcamento, topFechar);
  end;


  //Abre o formul�rio de aluno onde iremos inserir os dados
  procedure TfrmListarOrcamento.AbrirCadastro(const pTipoOperacao: TTipoOperacao);
  var
    lOrcamento: TfrmOrcamento;
  begin
    lOrcamento := TfrmOrcamento.Create(nil);
    try
      lOrcamento.TipoOperacao := pTipoOperacao;
      lOrcamento.ShowModal;
    finally
      lOrcamento.Free;
    end;
  end;

  procedure TfrmListarOrcamento.dbgListarOrcamentoDblClick(Sender: TObject);
  begin
      AbrirCadastro(topEditar);
  end;

  //Personaliza a coluna do formul�rio para ficar zebrada
  procedure TfrmListarOrcamento.dbgListarOrcamentoDrawColumnCell(Sender: TObject;
  const Rect: TRect; DataCol: Integer; Column: TColumn; State: TGridDrawState);
  begin
    ZebrarGrid(Sender, uConexao.queryOrcamento, Rect, Column, State);
  end;

end.
