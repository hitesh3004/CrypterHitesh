using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {        
    }
    protected void submit(object sender, EventArgs e)
    {
        txt1.Text= DateTime.Now.ToString("hh:mm tt");
        txt2.Text = DateTime.Now.ToString("M/dd/yyyy");

    }

}