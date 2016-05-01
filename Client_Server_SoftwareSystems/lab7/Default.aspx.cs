using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class _Default : System.Web.UI.Page
{
    SqlConnection connect = new SqlConnection("Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\\lab7DB.mdf;Integrated Security=True");
    protected void Page_Load(object sender, EventArgs e)
    {

    }


    
    protected void Vote_Click(object sender, EventArgs e)
    {
        if (RadioButtonList1.SelectedValue !="")
        {
            Label2.Text = String.Empty;
            SqlDataSource1.Update();
            Response.Redirect("Votes.aspx");
        }
        else
        {
            Label2.Text = "Please Select a Candidate before you press Vote";
        }
    }
}