program ArcoDeTreinamento;

uses
  Vcl.Forms,
  uArcoDeTreinamento in 'uArcoDeTreinamento.pas' {frmArcoDeTreinamento},
  uDM in 'uDM.pas' {uConexao},
  uFuncoes in 'uFuncoes.pas',
  uTipoOperacao in 'uTipoOperacao.pas',
  uListarOrcamento in 'uListarOrcamento.pas' {frmListarOrcamento},
  uListarItensOrcamento in 'uListarItensOrcamento.pas' {frmListarItemOrcamento},
  uOrcamento in 'uOrcamento.pas' {frmOrcamento},
  uItensOrcamento in 'uItensOrcamento.pas' {frmItensOrcamento};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TfrmArcoDeTreinamento, frmArcoDeTreinamento);
  Application.CreateForm(TuConexao, uConexao);
  Application.CreateForm(TfrmListarOrcamento, frmListarOrcamento);
  Application.CreateForm(TfrmListarItemOrcamento, frmListarItemOrcamento);
  Application.CreateForm(TfrmItensOrcamento, frmItensOrcamento);
  Application.Run;
end.
