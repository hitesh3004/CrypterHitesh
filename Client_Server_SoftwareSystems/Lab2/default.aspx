<%@ Page Language="C#" AutoEventWireup="true" CodeFile="default.aspx.cs" Inherits="_default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    
    <title>Date and Time</title>   
        <style type="text/css">
        .center {
            text-align: center;
        }
        .maindiv {
            margin: auto;
            border-style: solid;
            border-width: 1px;
            width: 800px;
            background-color: #C0C0C0;
            padding: 30px;
        }
        </style>
</head>
<body>
<form runat="server">
<div class="maindiv" style="height: 160px">
    <h1 class="center">Date and Time</h1>
    Date:<asp:TextBox ID="txt2" runat="server" CssClass="auto-style2" ReadOnly="True"></asp:TextBox>
    Time:<asp:TextBox id="txt1" runat="server" CssClass="auto-style3" ReadOnly="True" />

    <p>
<asp:Button OnClick="submit" Text="Get" runat="server" CssClass="auto-style1"  style="width:67px;" />
    </p>
</div>
</form>
</body>
</html>


