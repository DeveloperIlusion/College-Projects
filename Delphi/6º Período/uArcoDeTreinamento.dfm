object frmArcoDeTreinamento: TfrmArcoDeTreinamento
  Left = 0
  Top = 0
  Caption = 'Menu Principal'
  ClientHeight = 321
  ClientWidth = 594
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  Menu = mmArcoDeTreinamento
  OldCreateOrder = True
  WindowState = wsMaximized
  PixelsPerInch = 96
  TextHeight = 15
  object stbArcoDeTreinamento: TStatusBar
    Left = 0
    Top = 302
    Width = 594
    Height = 19
    Panels = <
      item
        Width = 50
      end
      item
        Width = 50
      end
      item
        Width = 50
      end>
  end
  object mmArcoDeTreinamento: TMainMenu
    Left = 368
    Top = 176
    object Cadastro1: TMenuItem
      Caption = 'Cadastro'
      object Aluno: TMenuItem
        Caption = 'Or'#231'amento'
        OnClick = OrcamentoClick
      end
      object Compras: TMenuItem
        Caption = 'Itens Or'#231'amento'
        OnClick = ItensOrcamentoClick
      end
    end
  end
  object tmrArcoDeTreinamento: TTimer
    OnTimer = tmrArcoDeTreinamentoTimer
    Left = 368
    Top = 112
  end
end
