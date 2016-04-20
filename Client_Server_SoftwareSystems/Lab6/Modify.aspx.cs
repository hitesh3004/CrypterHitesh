using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;
using System.Data;

public partial class Modify : System.Web.UI.Page
{
    SqlConnection connect = new SqlConnection("Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\\Lab6DB.mdf;Integrated Security=True");
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Double factor;
        String Unit, Factor;
        Unit = TB1.Text;
       
        Factor = TB2.Text;
        if ((Unit == "") || (!double.TryParse(Factor, out factor)))
        {
            if (Unit == "" || Factor == "")
            {
                Label1.Text = String.Empty;
                Label2.Text = String.Empty;
                Label3.Text = "Please Enter Value in both Text Boxes";
            }
            else {
                Label1.Text = String.Empty;
                Label2.Text = String.Empty;
                Label3.Text = "You cannot enter characters as Factor Input";
            }
        }
      
        else {
            if (DropDownList1.Items.FindByText(TB1.Text) == null)
            {
                TB1.Text = String.Empty;
                TB2.Text = String.Empty;
                Label2.Text = String.Empty;
                Label3.Text = String.Empty;
                SqlDataSource1.Insert();
                Label1.Text = "Your data has been stored successfully";
            }
            else
            {
                TB1.Text = String.Empty;
                TB2.Text = String.Empty;
                Label2.Text = String.Empty;
                Label3.Text = String.Empty;
                Label1.Text = "Element you are trying to add already exists";
            }
        }
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        if (DropDownList1.SelectedItem == null)
        {
            Label3.Text = "You cannot Delete from Empty DropdownList";
        }
        else {
          
                Label1.Text = String.Empty;
                Label3.Text = String.Empty;
                TB1.Text = String.Empty;
                TB2.Text = String.Empty;
                SqlDataSource1.Delete();
                Label1.Text = "Deleted Successfully";
                 
        }
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        DataView dv = (DataView)SqlDataSource1.Select(DataSourceSelectArguments.Empty);
        if (dv == null)
        {
            Label3.Text = "Drop down List is Empty";
        }
        else
        {
            Label1.Text = String.Empty;
            Label3.Text = String.Empty;
            //int id = Convert.ToInt32(DropDownList1.SelectedIndex) - 1;
            DataRow row = dv.Table.Rows[Convert.ToInt32(DropDownList1.SelectedIndex)];
            String factor = row["Factor"].ToString();
            Label2.Text ="The Factor for the selected unit is: "+factor+" meters ";
        }


    }

  
}