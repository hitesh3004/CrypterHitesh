<%@ Page Language="C#" AutoEventWireup="true" CodeFile="EditProfile.aspx.cs" Inherits="EditProfile" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Edit Profile</title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="text-align:center;padding-top:70px;border-style:outset;width:500px;margin:auto;background-color:lightgrey">
        <h1 style="color:blue">Edit your Profile here</h1>
        <asp:Label ID="FirstNameLabel" runat="server" Text="First Name : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="FirstNameTB" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="LastNameLabel" runat="server" Text="Last Name : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="LastNameTB" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="AgeLabel" runat="server" Text="Age : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="AgeTB" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="GenderLabel" runat="server" Text="Gender : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
        <asp:TextBox ID="GenderTB" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="PhoneLabel" runat="server" Text="Phone : "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
        <asp:TextBox ID="PhoneTB" runat="server"></asp:TextBox>
    
        <br />
        <br />
        <asp:Button ID="Update" runat="server" Text="Update" BackColor="#3366ff" ForeColor="White" OnClick="Update_Click" />
    
        <br />
        <br />
        <asp:Button ID="SignOut" runat="server" Text="Sign Out" OnClick="SignOut_Click" />
        <br />
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:lab8DBConnectionString1 %>" DeleteCommand="DELETE FROM [Profile] WHERE [Id] = @Id" InsertCommand="INSERT INTO [Profile] ([UserName], [FirstName], [LastName], [Age], [Gender], [Phone]) VALUES (@UserName, @FirstName, @LastName, @Age, @Gender, @Phone)" SelectCommand="SELECT * FROM [Profile]" UpdateCommand="UPDATE [Profile] SET [UserName] = @UserName, [FirstName] = @FirstName, [LastName] = @LastName, [Age] = @Age, [Gender] = @Gender, [Phone] = @Phone WHERE [Id] = @Id">
            <DeleteParameters>
                <asp:Parameter Name="Id" Type="Int32" />
            </DeleteParameters>
            <InsertParameters>
                <asp:Parameter Name="UserName" Type="String" />
                <asp:Parameter Name="FirstName" Type="String" />
                <asp:Parameter Name="LastName" Type="String" />
                <asp:Parameter Name="Age" Type="Int32" />
                <asp:Parameter Name="Gender" Type="String" />
                <asp:Parameter Name="Phone" Type="String" />
            </InsertParameters>
            <UpdateParameters>
                <asp:Parameter Name="UserName" Type="String" />
                <asp:Parameter Name="FirstName" Type="String" />
                <asp:Parameter Name="LastName" Type="String" />
                <asp:Parameter Name="Age" Type="Int32" />
                <asp:Parameter Name="Gender" Type="String" />
                <asp:Parameter Name="Phone" Type="String" />
                <asp:Parameter Name="Id" Type="Int32" />
            </UpdateParameters>
        </asp:SqlDataSource>
    
    </div>
    </form>
</body>
</html>
