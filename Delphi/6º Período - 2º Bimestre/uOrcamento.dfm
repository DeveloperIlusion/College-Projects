object frmOrcamento: TfrmOrcamento
  Left = 0
  Top = 0
  Caption = 'CRUD Or'#231'amento'
  ClientHeight = 165
  ClientWidth = 529
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  OldCreateOrder = True
  OnActivate = FormActivate
  PixelsPerInch = 96
  TextHeight = 15
  object tpanel1: TPanel
    Left = 0
    Top = 0
    Width = 529
    Height = 129
    TabOrder = 0
    object Label1: TLabel
      Left = 8
      Top = 14
      Width = 33
      Height = 15
      Caption = 'Nome'
    end
    object Label2: TLabel
      Left = 408
      Top = 14
      Width = 24
      Height = 15
      Caption = 'Data'
    end
    object Label3: TLabel
      Left = 8
      Top = 64
      Width = 62
      Height = 15
      Caption = 'Observa'#231#227'o'
    end
    object dbeNome: TDBEdit
      Left = 8
      Top = 35
      Width = 377
      Height = 23
      DataField = 'nome'
      DataSource = uConexao.sourceOrcamento
      TabOrder = 0
    end
    object dbeData: TDBEdit
      Left = 408
      Top = 35
      Width = 105
      Height = 23
      DataField = 'data'
      DataSource = uConexao.sourceOrcamento
      TabOrder = 1
    end
    object dbeObservacao: TDBEdit
      Left = 8
      Top = 85
      Width = 505
      Height = 36
      DataField = 'observacao'
      DataSource = uConexao.sourceOrcamento
      TabOrder = 2
    end
  end
  object btnCancelar: TBitBtn
    Left = 443
    Top = 135
    Width = 83
    Height = 28
    Caption = 'Cancelar'
    TabOrder = 1
    OnClick = btnCancelarClick
  end
  object btnGravar: TBitBtn
    Left = 354
    Top = 135
    Width = 83
    Height = 28
    Caption = 'Gravar'
    TabOrder = 2
    OnClick = btnGravarClick
  end
end
