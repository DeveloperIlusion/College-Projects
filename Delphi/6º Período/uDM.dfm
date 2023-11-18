object uConexao: TuConexao
  Left = 0
  Top = 0
  Caption = 'Conex'#245'es Com Banco'
  ClientHeight = 442
  ClientWidth = 628
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  OldCreateOrder = True
  PixelsPerInch = 96
  TextHeight = 15
  object Conexao: TFDPhysMySQLDriverLink
    VendorLib = 'C:\libmysql.dll'
    Left = 160
    Top = 24
  end
  object sourceOrcamento: TDataSource
    DataSet = queryOrcamento
    Left = 40
    Top = 152
  end
  object queryItemOrcamento: TFDQuery
    Connection = Banco
    SQL.Strings = (
      'SELECT'
      '   io.codigo,'
      '   io.nome,'
      '   io.posicao,'
      '   io.observacao,'
      '   io.quantidade,'
      '   io.valor,'
      '   io.cod_orcamento,'
      '   o.nome as orcamento'
      'FROM item_orcamento io'
      'INNER JOIN orcamento o ON o.codigo = io.cod_orcamento'
      ''
      '')
    Left = 160
    Top = 96
    object queryItemOrcamentocodigo: TFDAutoIncField
      FieldName = 'codigo'
      Origin = 'codigo'
      ProviderFlags = [pfInWhere, pfInKey]
      ReadOnly = True
    end
    object queryItemOrcamentonome: TStringField
      FieldName = 'nome'
      Origin = 'nome'
      Required = True
      Size = 200
    end
    object queryItemOrcamentoposicao: TIntegerField
      FieldName = 'posicao'
      Origin = 'posicao'
      Required = True
    end
    object queryItemOrcamentoobservacao: TStringField
      FieldName = 'observacao'
      Origin = 'observacao'
      Required = True
      Size = 250
    end
    object queryItemOrcamentoquantidade: TIntegerField
      FieldName = 'quantidade'
      Origin = 'quantidade'
      Required = True
    end
    object queryItemOrcamentovalor: TFloatField
      FieldName = 'valor'
      Origin = 'valor'
      Required = True
    end
    object queryItemOrcamentoorcamento: TStringField
      AutoGenerateValue = arDefault
      FieldName = 'orcamento'
      Origin = 'nome'
      ProviderFlags = []
      ReadOnly = True
      Size = 200
    end
    object queryItemOrcamentocod_orcamento: TIntegerField
      FieldName = 'cod_orcamento'
      Origin = 'cod_orcamento'
      Required = True
    end
  end
  object sourceItemOrcamento: TDataSource
    DataSet = queryItemOrcamento
    Left = 160
    Top = 152
  end
  object Banco: TFDConnection
    Params.Strings = (
      'Database=cascavel'
      'User_Name=root'
      'DriverID=MySQL')
    Connected = True
    LoginPrompt = False
    Left = 40
    Top = 24
  end
  object queryOrcamento: TFDQuery
    Connection = Banco
    SQL.Strings = (
      'Select'
      '   o.codigo,'
      '   o.nome,'
      '   o.data,'
      '   o.observacao'
      'From orcamento o')
    Left = 40
    Top = 96
    object queryOrcamentocodigo: TFDAutoIncField
      FieldName = 'codigo'
      Origin = 'codigo'
      ProviderFlags = [pfInWhere, pfInKey]
      ReadOnly = True
    end
    object queryOrcamentonome: TStringField
      FieldName = 'nome'
      Origin = 'nome'
      Required = True
      Size = 200
    end
    object queryOrcamentodata: TDateTimeField
      FieldName = 'data'
      Origin = '`data`'
      Required = True
    end
    object queryOrcamentoobservacao: TStringField
      FieldName = 'observacao'
      Origin = 'observacao'
      Required = True
      Size = 250
    end
  end
end
