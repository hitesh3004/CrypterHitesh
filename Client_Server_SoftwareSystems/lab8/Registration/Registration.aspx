<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Registration.aspx.cs" Inherits="Registration" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Registration</title>
    </head>
<body>
    <form id="form1" runat="server">
    <div style="">
        <div>
          
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:lab8DBConnectionString1 %>" SelectCommand="SELECT * FROM [UserCredentials]" InsertCommand="INSERT INTO UserCredentials(Username, Password) VALUES (@UserName, @Password)">
                <InsertParameters>
                    <asp:ControlParameter ControlID="UsernameTB" Name="UserName" PropertyName="Text" />
                    <asp:ControlParameter ControlID="ConfirmPasswordTB" Name="Password" PropertyName="Text" />
                </InsertParameters>
            </asp:SqlDataSource>
            <br />
            <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:lab8DBConnectionString1 %>" DeleteCommand="DELETE FROM [Profile] WHERE [Id] = @Id" InsertCommand="INSERT INTO Profile(FirstName, LastName, Age, Gender, Phone, UserName) VALUES (@FirstName, @LastName, @Age, @Gender, @Phone, @UserName)" SelectCommand="SELECT * FROM [Profile]" UpdateCommand="UPDATE [Profile] SET [FirstName] = @FirstName, [LastName] = @LastName, [Age] = @Age, [Gender] = @Gender, [Phone] = @Phone WHERE [Id] = @Id">
                <DeleteParameters>
                    <asp:Parameter Name="Id" Type="Int32" />
                </DeleteParameters>
                <InsertParameters>
                    <asp:ControlParameter ControlID="FirstNameTB" Name="FirstName" PropertyName="Text" Type="String" />
                    <asp:ControlParameter ControlID="LastNameTB" Name="LastName" PropertyName="Text" Type="String" />
                    <asp:ControlParameter ControlID="AgeTB" Name="Age" PropertyName="Text" Type="Int32" />
                    <asp:ControlParameter ControlID="GenderDL" Name="Gender" PropertyName="SelectedValue" Type="String" />
                    <asp:ControlParameter ControlID="PhoneTB" Name="Phone" PropertyName="Text" Type="String" />
                    <asp:ControlParameter ControlID="UsernameTB" Name="UserName" PropertyName="Text" />
                </InsertParameters>
                <UpdateParameters>
                    <asp:Parameter Name="FirstName" Type="String" />
                    <asp:Parameter Name="LastName" Type="String" />
                    <asp:Parameter Name="Age" Type="Int32" />
                    <asp:Parameter Name="Gender" Type="String" />
                    <asp:Parameter Name="Phone" Type="String" />
                    <asp:Parameter Name="Id" Type="Int32" />
                </UpdateParameters>
            </asp:SqlDataSource>
            <br />
        </div>
        <div style="text-align:center;padding-top:70px;border-style:outset;width:500px;margin:auto;background-color:lightgrey">
            <h1 style="color:blue">Register for account here</h1>
            <asp:Button ID="BacktoHome" runat="server" Text="Home Page" OnClick="BacktoHome_Click" />
            <br />

            <asp:Label ID="FirstName" runat="server" Text="First Name"></asp:Label>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Label ID="LastName" runat="server" Text="Last Name"></asp:Label>
            <br />
            <asp:TextBox ID="FirstNameTB" runat="server"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="LastNameTB" runat="server"></asp:TextBox>
            <br />
            <asp:Label ID="NameError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="Username" runat="server" Text="Username"></asp:Label>
            <br />
            <asp:TextBox ID="UsernameTB" runat="server"></asp:TextBox>
            <br />
            <asp:Label ID="UserNameError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="Age" runat="server" Text="Age"></asp:Label>
            <br />
            <asp:TextBox ID="AgeTB" runat="server"></asp:TextBox>
            &nbsp;<br />
            <asp:Label ID="AgeError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="CreatePassword" runat="server" Text="Create Password"></asp:Label>
            <br />
            <asp:TextBox ID="CreatePasswordTB" runat="server" TextMode="Password"></asp:TextBox>
            <br />
            <asp:Label ID="CreatePasswordError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="ConfirmPassword" runat="server" Text="Confirm Password"></asp:Label>
            <br />
            <asp:TextBox ID="ConfirmPasswordTB" runat="server" TextMode="Password"></asp:TextBox>
            <br />
            <asp:Label ID="ConfirmPasswordError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="Gender" runat="server" Text="Gender"></asp:Label>
            <br />
            <asp:DropDownList ID="GenderDL" runat="server">
                <asp:ListItem>Male</asp:ListItem>
                <asp:ListItem>Female</asp:ListItem>
            </asp:DropDownList>
            <br />
            <asp:Label ID="GenderError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <asp:Label ID="Phone" runat="server" Text="Phone"></asp:Label>
            <br />
            <asp:TextBox ID="ExtensionTB" runat="server" Width="21px" ReadOnly="True" Text="+1"></asp:TextBox>
&nbsp;
            <asp:TextBox ID="PhoneTB" runat="server"></asp:TextBox>

            <br />
            <asp:Label ID="PhoneError" runat="server" Text="" Font-Size="Smaller" Font-Italic="true" ForeColor="#ff0000"></asp:Label>
            <br />
            <br />
            <asp:Button ID="SubmitTB" runat="server" Text="Submit" BackColor="#3366ff" ForeColor="White" OnClick="SubmitTB_Click" />
          
            <br />
          
        </div>
    </div>
    </form>
</body>
</html>
