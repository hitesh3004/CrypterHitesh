<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ProfilePage.aspx.cs" Inherits="ProfilePage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Profile Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="text-align:center;padding-top:70px;border-style:outset;width:500px;margin:auto;background-color:lightgrey">
    <h1 style="color:blue">Welcome to your profile</h1>
        <p>
            <asp:PlaceHolder ID="PlaceHolder1" runat="server"></asp:PlaceHolder>
        </p>
        <p>
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
        </p>
        <p>
            <asp:Label ID="EditProfileLabel" runat="server" Text="To Edit Profile Click Here: "></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="EditProfile" runat="server" Text="Edit" BackColor="#3366ff" ForeColor="White" OnClick="EditProfile_Click" />
        </p>
        <p>
            <asp:Label ID="DeleteProfileLabel" runat="server" Text="To Delete Profile Click Here: "></asp:Label>
        &nbsp;
            <asp:Button ID="DeleteProfile" runat="server" Text="Delete" BackColor="Red" ForeColor="White" OnClick="DeleteProfile_Click" />
        </p>
        <p>
            <asp:Label ID="SearchLabel" runat="server" Text="See Other Profiles Here: "></asp:Label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:DropDownList ID="OtherProfileDL" runat="server" DataSourceID="SqlDataSource1" DataTextField="UserName" DataValueField="UserName">
            </asp:DropDownList>
&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Go" runat="server" Text="Go" BackColor="Blue" ForeColor="White" OnClick="Go_Click" />
        </p>
        <p>
            <asp:Button ID="Back" runat="server" Text="Back" OnClick="Back_Click" />
        </p>
        <p>
        

            <asp:Button ID="SignOut" runat="server" Text="Sign Out" OnClick="SignOut_Click" />
        

    </div>
    </form>
</body>
</html>
