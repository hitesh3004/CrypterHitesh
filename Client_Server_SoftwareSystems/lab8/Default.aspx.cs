using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Web.Security;
using System.Web.UI.WebControls.WebParts;
using System.Data;

public partial class _Default : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection("Data Source = (LocalDB)\\MSSQLLocalDB; AttachDbFilename=|DataDirectory|\\lab8DB.mdf;Integrated Security = True");
    protected void Page_Load(object sender, EventArgs e)
    {

    }



    protected void Register_Click(object sender, EventArgs e)
    {
        Response.Redirect("Registration/Registration.aspx");
        
    }

    protected void SignIn_Click(object sender, EventArgs e)
    {
        WrongCredentials.Text = String.Empty;
        if (ValidateUserCredentials())
            FormsAuthentication.RedirectFromLoginPage(UsernameTB.Text,
                Rememberme.Checked);
        else
        {
            WrongCredentials.Text = "Wrong User Name or Password";
            //Response.Redirect(".aspx", true);
        }

    }

    private bool ValidateUserCredentials()
    {
        con.Open();
        SqlCommand cmd = con.CreateCommand();
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = "SELECT * FROM UserCredentials WHERE Username='" + UsernameTB.Text + "'AND Password='" + PasswordTB.Text + "'";
        cmd.ExecuteNonQuery();
        DataTable dt = new DataTable();
        SqlDataAdapter dadp = new SqlDataAdapter(cmd);
        dadp.Fill(dt);
        foreach (DataRow dr in dt.Rows)
        {
            return true;
        }
        return false;
        con.Close();
        
    }

}