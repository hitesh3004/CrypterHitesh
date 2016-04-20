<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Lab 5</title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="background-color: #C0C0C0; border-style: solid; border-width: 1px; margin: auto; width: 800px; padding: 10px">
        
        <h1 style="text-align: center">Convert your Distance</h1>
        <p style="text-align: center" class="auto-style1">
        
        <asp:Label ID="Label1" runat="server" Text="Please Enter your Number here"></asp:Label>
        
        <br />

        <asp:DropDownList ID="DropDownList1" runat="server" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged" DataSourceID="SqlDataSource1" DataTextField="Unit" DataValueField="Factor">
        
        </asp:DropDownList>
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" SelectCommand="SELECT * FROM [Converions]"></asp:SqlDataSource>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Convert" OnClick="Button1_Click" />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label2" runat="server" Text=""></asp:Label>
        <br />
        <asp:DropDownList ID="DropDownList2" runat="server" DataSourceID="SqlDataSource1" DataTextField="Unit" DataValueField="Factor">
        </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server" ReadOnly="True"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
        <br />
        <br />
        
    </div>
    </form>
</body>
</html>
