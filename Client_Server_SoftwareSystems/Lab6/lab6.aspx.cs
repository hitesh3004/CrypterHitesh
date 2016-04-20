using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class lab6 : System.Web.UI.Page
{
    double meter, input;
    protected void Page_Load(object sender, EventArgs e)
    {

    }



    protected void Button1_Click(object sender, EventArgs e)
    {

        String s = TextBox1.Text;
        TextBox2.Text = String.Empty;


        if (DropDownList1.SelectedIndex == DropDownList2.SelectedIndex)
        {
            Label3.Text = "Please select 2 different units";
            TextBox1.Text = String.Empty;
            TextBox2.Text = String.Empty;
            Label2.Text = String.Empty;
        }
        else if (!double.TryParse(s, out input))
        {
            if (s == "")
            {
                Label3.Text = "Please Enter Some Input Value";
                TextBox2.Text = String.Empty;
                Label2.Text = String.Empty;

            }
            else {
                Label3.Text = "You cannot enter characters as input";
            }
        }
        else {
            if (s != "")
            {

                input = Convert.ToDouble(s);
                meter = input * Convert.ToDouble(DropDownList1.SelectedValue);
                TextBox2.Text = (meter / Convert.ToDouble(DropDownList2.SelectedValue)).ToString();
                Label2.Text = "Your answer after Converting is:";
                Label3.Text = String.Empty;
            }
        }

    }

    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("Modify.aspx");
    }
}