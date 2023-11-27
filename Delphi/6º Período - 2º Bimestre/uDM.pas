unit uDM;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, FireDAC.Stan.Intf, FireDAC.Stan.Option,
  FireDAC.Stan.Error, FireDAC.UI.Intf, FireDAC.Phys.Intf, FireDAC.Stan.Def,
  FireDAC.Stan.Pool, FireDAC.Stan.Async, FireDAC.Phys, FireDAC.Phys.MySQL,
  FireDAC.Phys.MySQLDef, FireDAC.VCLUI.Wait, Data.DB, FireDAC.Comp.Client,
  FireDAC.Stan.Param, FireDAC.DatS, FireDAC.DApt.Intf, FireDAC.DApt,
  FireDAC.Comp.DataSet;

type
  TuConexao = class(TForm)
    Conexao: TFDPhysMySQLDriverLink;
    queryItemOrcamento: TFDQuery;
    sourceItemOrcamento: TDataSource;
    Banco: TFDConnection;
    queryOrcamento: TFDQuery;
    sourceOrcamento: TDataSource;
    queryItemOrcamentocodigo: TFDAutoIncField;
    queryItemOrcamentonome: TStringField;
    queryItemOrcamentoposicao: TIntegerField;
    queryItemOrcamentoobservacao: TStringField;
    queryItemOrcamentoquantidade: TIntegerField;
    queryItemOrcamentovalor: TFloatField;
    queryItemOrcamentoorcamento: TStringField;
    queryOrcamentocodigo: TFDAutoIncField;
    queryOrcamentonome: TStringField;
    queryOrcamentodata: TDateTimeField;
    queryOrcamentoobservacao: TStringField;
    queryItemOrcamentocod_orcamento: TIntegerField;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  uConexao: TuConexao;

implementation

{$R *.dfm}

end.
