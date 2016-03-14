<%@ Page Language="C#" AutoEventWireup="true" CodeFile="anagram.aspx.cs" Inherits="anagram" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Get Anagrams</title>
    <style type="text/css">
        .auto-style1 {
            margin-left: 39px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div style="background-color: #C0C0C0; border-style: solid; border-width: 1px; margin: auto; width: 800px; padding: 10px">
        <h1 style="text-align: center">Find Anagrams</h1>
        Enter a character string:&nbsp;

        <asp:TextBox ID="txt1" runat="server" style="width:147px;" ></asp:TextBox>
        <asp:CheckBox ID="CheckBox1" runat="server" OnCheckedChanged="CheckBox1_CheckedChanged" />
        <asp:Label ID="Label1" runat="server" Text="Label">Eliminate Duplicates</asp:Label>
    
        <br />
        <br />
        <br />
    
        <asp:ListBox ID="ListBox1" runat="server" Height="124px" OnSelectedIndexChanged="ListBox1_SelectedIndexChanged" style="height:85px;width:150px;"></asp:ListBox>
        <br />
        <br />
        <asp:Button OnClick="calculate" Text="Find Anagrams" runat="server" CssClass="auto-style1" Height="23px" Width="112px" />
        <p>
            <asp:Label ID="Label2" runat="server" Text=""></asp:Label>
        </p>
    </div>
    </form>
</body>
</html>
