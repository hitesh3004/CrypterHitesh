using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Drawing;
using System.Text;
using System.Data.SqlClient;
using System.Configuration;

public partial class Registration : System.Web.UI.Page
{
    SqlConnection connect = new SqlConnection("Data Source = (LocalDB)\\MSSQLLocalDB; AttachDbFilename=|DataDirectory|\\lab8DB.mdf;Integrated Security = True");
    protected void Page_Load(object sender, EventArgs e)
    {
            
    }

    protected void BacktoHome_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/Default.aspx");
    }

    protected void SubmitTB_Click(object sender, EventArgs e)
    {
        int ageErrorTest, flag;
        long phoneErrorTest;
        flag = 1;
        NameError.Text = String.Empty;
        CreatePasswordError.Text = String.Empty;
        ConfirmPasswordError.Text= String.Empty; ;
        AgeError.Text= String.Empty; 
        PhoneError.Text= String.Empty;
        if (FirstNameTB.Text=="")
        {
            FirstNameTB.BorderColor = Color.Red; 
            NameError.Text = "Blank Text Box";
            flag = 0;
        }
        if (LastNameTB.Text == "")
        {
            LastNameTB.BorderColor = Color.Red;
            NameError.Text = "Blank Text Box";
            flag = 0;
        }
        if (FirstNameTB.Text.Any(char.IsDigit) || LastNameTB.Text.Any(char.IsDigit))
        {
            NameError.Text = "Your name cannot have digits in it";
            flag = 0;
        }
        if (!(Int32.TryParse(AgeTB.Text, out ageErrorTest)))
        {
            if (AgeTB.Text == "")
            {
                AgeError.Text = "Do not keep the Age text box blank";
                AgeTB.BorderColor = Color.Red;
                flag = 0;
            }
            else
            {
                AgeError.Text = "Do not enter charcter as your Age";
                AgeTB.BorderColor = Color.Red;
                flag = 0;
            }
        }
        if ((CreatePasswordTB.Text).Length<6)
        {
            CreatePasswordError.Text = "Password is too short";
            CreatePasswordTB.BorderColor = Color.Red;
            flag = 0;
        }
        if (!ConfirmPasswordTB.Text.Equals(CreatePasswordTB.Text))
        {
            ConfirmPasswordError.Text = "Your passwords do not match";
            ConfirmPasswordTB.BorderColor = Color.Red;
            flag = 0;
        }

        if(!(Int64.TryParse(PhoneTB.Text,out phoneErrorTest))){
            if (PhoneTB.Text == "")
            {
                PhoneError.Text = "Do not keep the Phone number text box blank";
                PhoneTB.BorderColor = Color.Red;
                flag = 0;
            }
            else
            {
                PhoneError.Text = "Do not enter charcter as phone number";
                PhoneTB.BorderColor = Color.Red;
                flag = 0;
            }
        }
        SqlConnection con = new SqlConnection();
        con.ConnectionString = ConfigurationManager.ConnectionStrings["lab8DBConnectionString1"].ToString();
        con.Open();
        SqlCommand cmd = new SqlCommand();
        
        cmd.CommandText = "SELECT *FROM[Profile] WHERE UserName='" + UsernameTB.Text + "'";
        cmd.Connection = con;
        SqlDataReader rd = cmd.ExecuteReader();
        if (rd.HasRows)
        {
            UserNameError.Text = "User Name already exists,Try new!";
            UsernameTB.BorderColor = Color.Red;
            flag = 0;
        }
        if (flag == 1)
        {
            SqlDataSource1.Insert();
            SqlDataSource2.Insert();
            Response.Redirect("~/Default.aspx");
            
        }
        
    }

 

   

  
}