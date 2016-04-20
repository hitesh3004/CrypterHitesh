<%@ Page Language="C#" AutoEventWireup="true" CodeFile="lab6.aspx.cs" Inherits="lab6" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Lab 6</title>
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
           
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Convert" OnClick="Button1_Click" />
        <br />
        <br />
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:Lab6DBConnectionString1 %>" DeleteCommand="DELETE FROM [Conversion] WHERE [Id] = @Id" InsertCommand="INSERT INTO [Conversion] ([Unit], [Factor]) VALUES (@Unit, @Factor)" SelectCommand="SELECT * FROM [Conversion]" UpdateCommand="UPDATE [Conversion] SET [Unit] = @Unit, [Factor] = @Factor WHERE [Id] = @Id">
                <DeleteParameters>
                    <asp:Parameter Name="Id" Type="Int32" />
                </DeleteParameters>
                <InsertParameters>
                    <asp:Parameter Name="Unit" Type="String" />
                    <asp:Parameter Name="Factor" Type="Double" />
                </InsertParameters>
                <UpdateParameters>
                    <asp:Parameter Name="Unit" Type="String" />
                    <asp:Parameter Name="Factor" Type="Double" />
                    <asp:Parameter Name="Id" Type="Int32" />
                </UpdateParameters>
            </asp:SqlDataSource>
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
         <p style="text-align: center" class="auto-style1">
        
        <br />
             <asp:Button ID="Button2" runat="server" Text="Modify Database" OnClick="Button2_Click" Width="136px" />
        <br />
        
    </div>
    </form>
</body>
</html>
