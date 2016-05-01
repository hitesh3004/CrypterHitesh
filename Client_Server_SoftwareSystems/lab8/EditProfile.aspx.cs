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

public partial class EditProfile : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!Page.IsPostBack)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
            con.Open();
            SqlCommand cmd = new SqlCommand();
            string user = User.Identity.Name;
            cmd.CommandText = "SELECT *FROM[Profile] WHERE UserName='" + user + "'";
            cmd.Connection = con;
            SqlDataReader rd = cmd.ExecuteReader();
            if (rd.HasRows)
            {
                while (rd.Read())
                {
                    FirstNameTB.Text = rd["FirstName"].ToString();
                    LastNameTB.Text = rd["LastName"].ToString();
                    AgeTB.Text = rd["Age"].ToString();
                    GenderTB.Text=rd["Gender"].ToString();
                    PhoneTB.Text = rd["Phone"].ToString(); 
                }
            }
            rd.Close();
        }
    }


    protected void Update_Click(object sender, EventArgs e)
    {
        SqlConnection con = new SqlConnection();
        con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
        con.Open();
        SqlCommand cmd = new SqlCommand();
        string user = User.Identity.Name;
        cmd.CommandText = "UPDATE Profile SET FirstName='"+FirstNameTB.Text+"', LastName='"+LastNameTB.Text+"', Age='"+AgeTB.Text+"', Gender='"+GenderTB.Text+"', Phone='"+PhoneTB.Text+ "' WHERE UserName='" + user + "'";
        cmd.Connection = con;
        cmd.ExecuteNonQuery();
        con.Close();
        Response.Redirect("ProfilePage.aspx");
    }

    protected void SignOut_Click(object sender, EventArgs e)
    {
        FormsAuthentication.SignOut();
        Response.Redirect("Default.aspx", true);
    }
}