<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Home Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="">
    <h1>Welcome,</h1>
        
        <div style="text-align:center;padding-top:70px;border-style:outset;width:500px;margin:auto;background-color:lightgrey">
            <h2>Sign in to your account<asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:lab8DBConnectionString1 %>" DeleteCommand="DELETE FROM [UserCredentials] WHERE [Id] = @Id" InsertCommand="INSERT INTO [UserCredentials] ([Username], [FirstName], [LastName], [Password], [Phone], [Age], [Gender]) VALUES (@Username, @FirstName, @LastName, @Password, @Phone, @Age, @Gender)" SelectCommand="SELECT Username, Password FROM UserCredentials" UpdateCommand="UPDATE [UserCredentials] SET [Username] = @Username, [FirstName] = @FirstName, [LastName] = @LastName, [Password] = @Password, [Phone] = @Phone, [Age] = @Age, [Gender] = @Gender WHERE [Id] = @Id">
                <DeleteParameters>
                    <asp:Parameter Name="Id" Type="Int32" />
                </DeleteParameters>
                <InsertParameters>
                    <asp:Parameter Name="Username" Type="String" />
                    <asp:Parameter Name="FirstName" Type="String" />
                    <asp:Parameter Name="LastName" Type="String" />
                    <asp:Parameter Name="Password" Type="String" />
                    <asp:Parameter Name="Phone" Type="String" />
                    <asp:Parameter Name="Age" Type="Int32" />
                    <asp:Parameter Name="Gender" Type="String" />
                </InsertParameters>
                <UpdateParameters>
                    <asp:Parameter Name="Username" Type="String" />
                    <asp:Parameter Name="FirstName" Type="String" />
                    <asp:Parameter Name="LastName" Type="String" />
                    <asp:Parameter Name="Password" Type="String" />
                    <asp:Parameter Name="Phone" Type="String" />
                    <asp:Parameter Name="Age" Type="Int32" />
                    <asp:Parameter Name="Gender" Type="String" />
                    <asp:Parameter Name="Id" Type="Int32" />
                </UpdateParameters>
                </asp:SqlDataSource>
            </h2>
            <asp:Label ID="Username" runat="server" Text="Username"></asp:Label>
            <br />
            <asp:TextBox ID="UsernameTB" runat="server" Width="221px"></asp:TextBox>
            <br />
            <br />
            <asp:Label ID="Password" runat="server" Text="Password"></asp:Label>           
            <br />
            <asp:TextBox ID="PasswordTB" runat="server" Width="219px" TextMode="Password"></asp:TextBox>
            <br />
            <asp:CheckBox ID="Rememberme" runat="server" Text="Remember me"/>
            <br />
            
            <br />
            <asp:Label ID="WrongCredentials" runat="server" Text=""></asp:Label>
            
            <br />
            <asp:Button ID="SignIn" runat="server" Text="Sign In" Width="121px" BackColor="#3366ff" ForeColor="White" OnClick="SignIn_Click"/>
            <br />
            <asp:Label ID="Label1" runat="server" Text="Enter Username and click here"></asp:Label>
            <br />
            <br />
        </div>
        <div style="text-align:center;padding-top: 20px">

            <asp:Label ID="Noaccount" runat="server" Text="Don't have an account ?"></asp:Label>


            <br />
            <asp:Button ID="Register" runat="server" Text="Register Here"  BackColor="#3366ff" ForeColor="White" OnClick="Register_Click"/>


        </div>
    </div>
    </form>
</body>
</html>
