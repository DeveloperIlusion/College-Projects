object frmPrincipal: TfrmPrincipal
  Left = 0
  Top = 0
  Caption = 'Menu Principal'
  ClientHeight = 442
  ClientWidth = 628
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  Menu = mmPrincipal
  Position = poDesktopCenter
  TextHeight = 15
  object StatusBar: TStatusBar
    Left = 0
    Top = 423
    Width = 628
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
    ExplicitTop = 422
    ExplicitWidth = 624
  end
  object mmPrincipal: TMainMenu
    Left = 408
    Top = 136
    object Cadastrar1: TMenuItem
      Caption = 'Cadastrar'
      object Cadastrar2: TMenuItem
        Caption = 'Alunos'
      end
    end
  end
  object tmrPrincipal: TTimer
    OnTimer = tmrPrincipalTimer
    Left = 496
    Top = 136
  end
end
