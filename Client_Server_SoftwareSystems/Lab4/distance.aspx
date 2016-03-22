<%@ Page Language="C#" AutoEventWireup="true" CodeFile="distance.aspx.cs" Inherits="distance" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Measuring Length</title>
    <style type="text/css">
        .auto-style1 {
            width: 207px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <h1>Welcome,</h1>
    <div style="background-color: #C0C0C0; border-style: solid; border-width: 1px; margin: auto; width: 800px; padding: 10px">
        
        <h1 style="text-align: center">Convert your Distance</h1>
        <p style="text-align: center" class="auto-style1">
            <asp:Label ID="Label2" runat="server" Text="Please Enter Your Number Here: "></asp:Label>
        </p>

        <asp:DropDownList ID="DropDownList1" runat="server" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged">
         <asp:ListItem>Kilometers</asp:ListItem>
         <asp:ListItem>Meters</asp:ListItem>
         <asp:ListItem>Centimeters</asp:ListItem>
         <asp:ListItem>Millimeters</asp:ListItem> 
         <asp:ListItem>Miles</asp:ListItem>
         <asp:ListItem>Yards</asp:ListItem>
         <asp:ListItem>Feet</asp:ListItem>
         <asp:ListItem>Inches</asp:ListItem>
        </asp:DropDownList>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TB1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="B1" runat="server" OnClick="Button1_Click" Text="Convert" />
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
        <br />
        
        <asp:DropDownList ID="DropDownList2" runat="server" OnSelectedIndexChanged="DropDownList2_SelectedIndexChanged">
         <asp:ListItem Value="0.001">Kilometers</asp:ListItem>
         <asp:ListItem Value="1">Meters</asp:ListItem>
         <asp:ListItem Value="100">Centimeters</asp:ListItem>
         <asp:ListItem Value="1000">Millimeters</asp:ListItem> 
         <asp:ListItem Value="0.0006214">Miles</asp:ListItem>
         <asp:ListItem Value="1.09361">Yards</asp:ListItem>
         <asp:ListItem Value="3.28084">Feet</asp:ListItem>
         <asp:ListItem Value="39.3701">Inches</asp:ListItem>
        </asp:DropDownList>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TB2" runat="server"></asp:TextBox>
&nbsp;
        <br />
        <br />
        <asp:Label ID="Label1" runat="server" Text=""></asp:Label>
    </div>
    
    </form>
</body>
</html>
