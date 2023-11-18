object frmListarItemOrcamento: TfrmListarItemOrcamento
  Left = 0
  Top = 0
  Caption = 'Lista de Itens de Or'#231'amento'
  ClientHeight = 410
  ClientWidth = 634
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  OldCreateOrder = True
  OnActivate = FormActivate
  OnClose = FormClose
  PixelsPerInch = 96
  TextHeight = 15
  object Panel1: TPanel
    Left = 0
    Top = 0
    Width = 634
    Height = 25
    Align = alTop
    Caption = 'Itens de Or'#231'amento'
    TabOrder = 0
  end
  object dbgListar: TDBGrid
    Left = 0
    Top = 25
    Width = 634
    Height = 359
    Align = alClient
    DataSource = uConexao.sourceItemOrcamento
    ReadOnly = True
    TabOrder = 1
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -12
    TitleFont.Name = 'Segoe UI'
    TitleFont.Style = []
    OnDrawColumnCell = dbgListarDrawColumnCell
    OnDblClick = dbgListarDblClick
    Columns = <
      item
        Expanded = False
        FieldName = 'codigo'
        Width = 43
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'nome'
        Width = 176
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'posicao'
        Width = 47
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'observacao'
        Width = 117
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'quantidade'
        Width = 65
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'valor'
        Width = 58
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'orcamento'
        Width = 105
        Visible = True
      end>
  end
  object Panel2: TPanel
    Left = 0
    Top = 384
    Width = 634
    Height = 26
    Align = alBottom
    TabOrder = 2
    object btnExcluir: TBitBtn
      Left = 554
      Top = 0
      Width = 75
      Height = 25
      Caption = 'Excluir'
      TabOrder = 0
      OnClick = btnExcluirClick
    end
    object btnEditar: TBitBtn
      Left = 473
      Top = 1
      Width = 75
      Height = 25
      Caption = 'Editar'
      TabOrder = 1
      OnClick = btnEditarClick
    end
    object btnInserir: TBitBtn
      Left = 392
      Top = 1
      Width = 75
      Height = 25
      Caption = 'Novo'
      TabOrder = 2
      OnClick = btnInserirClick
    end
  end
end
