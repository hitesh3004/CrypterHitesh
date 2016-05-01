using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Text;
using System.Configuration;
using System.Data.SqlClient;
using System.Web.Security;

public partial class ProfilePage : System.Web.UI.Page
{
    StringBuilder table = new StringBuilder();
    protected void Page_Load(object sender, EventArgs e)
    {
        EditProfileLabel.Visible = true;
        DeleteProfileLabel.Visible = true;
        SearchLabel.Visible = true;
        EditProfile.Visible = true;
        DeleteProfile.Visible = true;
        OtherProfileDL.Visible = true;
        Go.Visible = true;
        Back.Visible = false;
        if (!Page.IsPostBack)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
            con.Open();
            SqlCommand cmd = new SqlCommand();
            string user = User.Identity.Name;
            cmd.CommandText = "SELECT *FROM[Profile] WHERE UserName='"+user+"'";
            cmd.Connection = con;
            SqlDataReader rd = cmd.ExecuteReader();
            table.Append("<table border='1'>");
            if (rd.HasRows)
            {
                while (rd.Read())
                {
                    table.Append("<tr>");
                    table.Append("<td>" + "UserName" + "</td>");
                    table.Append("<td>" + rd["UserName"] + "</td>");
                    table.Append("</tr>");
                    table.Append("<tr>");
                    table.Append("<td>" + "First Name" + "</td>");
                    table.Append("<td>" + rd["FirstName"] + "</td>");
                    table.Append("</tr>");
                    table.Append("<tr>");
                    table.Append("<td>" + "Last Name" + "</td>");
                    table.Append("<td>" + rd["LastName"] + "</td>");
                    table.Append("</tr>");
                    table.Append("<tr>");
                    table.Append("<td>" + "Age" + "</td>");
                    table.Append("<td>" + rd["Age"] + "</td>");
                    table.Append("</tr>");
                    table.Append("<tr>");
                    table.Append("<td>" + "Gender" + "</td>");
                    table.Append("<td>" + rd["Gender"] + "</td>");
                    table.Append("</tr>");
                    table.Append("<tr>");
                    table.Append("<td>" + "Phone" + "</td>");
                    table.Append("<td>" + rd["Phone"] + "</td>");
                    table.Append("</tr>");
                }
            }
            table.Append("</table>");
            PlaceHolder1.Controls.Add(new Literal { Text = table.ToString() });
            rd.Close();
        }

    }

    protected void EditProfile_Click(object sender, EventArgs e)
    {
        Response.Redirect("EditProfile.aspx");
    }

    protected void DeleteProfile_Click(object sender, EventArgs e)
    {
        SqlConnection con = new SqlConnection();
        con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
        con.Open();
        SqlCommand cmd = new SqlCommand();
        string user = User.Identity.Name;
        cmd.CommandText = "DELETE FROM Profile WHERE UserName='" + user + "'";
        cmd.Connection = con;
        cmd.ExecuteNonQuery();
        cmd.CommandText = "INSERT INTO Profile (UserName) VALUES ('"+user+"')";
        cmd.ExecuteNonQuery();
        con.Close();
        Response.Redirect("Default.aspx");
    }

    protected void Go_Click(object sender, EventArgs e)
    {
        EditProfileLabel.Visible = false;
        DeleteProfileLabel.Visible = false;
        SearchLabel.Visible = false;
        EditProfile.Visible = false;
        DeleteProfile.Visible = false;
        OtherProfileDL.Visible = false;
        Go.Visible = false;
        Back.Visible = true;
        string user = OtherProfileDL.SelectedValue;
        SqlConnection con = new SqlConnection();
        con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
        con.Open();
        SqlCommand cmd = new SqlCommand();
        
        cmd.CommandText = "SELECT *FROM[Profile] WHERE UserName='" + user + "'";
        cmd.Connection = con;
        SqlDataReader rd = cmd.ExecuteReader();
        table.Append("<table border='1'>");
        if (rd.HasRows)
        {
            while (rd.Read())
            {
                table.Append("<tr>");
                table.Append("<td>" + "UserName" + "</td>");
                table.Append("<td>" + rd["UserName"] + "</td>");
                table.Append("</tr>");
                table.Append("<tr>");
                table.Append("<td>" + "First Name" + "</td>");
                table.Append("<td>" + rd["FirstName"] + "</td>");
                table.Append("</tr>");
                table.Append("<tr>");
                table.Append("<td>" + "Last Name" + "</td>");
                table.Append("<td>" + rd["LastName"] + "</td>");
                table.Append("</tr>");
                table.Append("<tr>");
                table.Append("<td>" + "Age" + "</td>");
                table.Append("<td>" + rd["Age"] + "</td>");
                table.Append("</tr>");
                table.Append("<tr>");
                table.Append("<td>" + "Gender" + "</td>");
                table.Append("<td>" + rd["Gender"] + "</td>");
                table.Append("</tr>");
                table.Append("<tr>");
                table.Append("<td>" + "Phone" + "</td>");
                table.Append("<td>" + rd["Phone"] + "</td>");
                table.Append("</tr>");
            }
        }
        table.Append("</table>");
        PlaceHolder1.Controls.Add(new Literal { Text = table.ToString() });
        rd.Close();

    }

    protected void Back_Click(object sender, EventArgs e)
    {
        Response.Redirect("ProfilePage.aspx");
    }

    protected void SignOut_Click(object sender, EventArgs e)
    {
        FormsAuthentication.SignOut();
        Response.Redirect("Default.aspx", true);
    }
}