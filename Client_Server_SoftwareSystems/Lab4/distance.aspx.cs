using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class distance : System.Web.UI.Page
{
    double meter,input;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void DropDownList2_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Double[] convert = new Double[8];
        convert[0] = 1000;
        convert[1] = 1;
        convert[2] = 0.01;
        convert[3] = 0.001;
        convert[4] = 1609.34;
        convert[5] = 0.9144;
        convert[6] = 0.3048;
        convert[7] = 0.0254;
        String s = TB1.Text;
        if (s=="")
        {
            Label1.Text = "Please Enter Some Input Value";
            TB2.Text = String.Empty;
            Label3.Text = String.Empty;
        }
        if (DropDownList1.SelectedIndex == DropDownList2.SelectedIndex)
        {
            Label1.Text = "Please check your convert parameters";
            TB1.Text = String.Empty;
            TB2.Text = String.Empty;
            Label3.Text = String.Empty;
        }

        else if(s!=""){

            input = Convert.ToDouble(s);
            meter = input * convert[DropDownList1.SelectedIndex];
            TB2.Text = (meter/convert[DropDownList2.SelectedIndex]).ToString();

        }
    }
}