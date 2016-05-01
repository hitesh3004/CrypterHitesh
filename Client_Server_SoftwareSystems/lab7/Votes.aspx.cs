using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Data.SqlClient;
using System.Configuration;
using System.Web.UI.WebControls;
using System.Text;


public partial class Votes : System.Web.UI.Page
{
    StringBuilder table = new StringBuilder();
    double total,percent;
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!Page.IsPostBack)
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = ConfigurationManager.ConnectionStrings["lab7DBConnectionString1"].ToString();
            con.Open();
            SqlCommand cmdTotal = new SqlCommand();
            cmdTotal.CommandText = "SELECT SUM(CurrentVotes) AS TotalVotes FROM Candidates";
            cmdTotal.Connection = con;
            SqlDataReader rd1 = cmdTotal.ExecuteReader();
            while (rd1.Read())
            {
                total = Convert.ToDouble(rd1[0]);
            }
            //Response.Write("total: " + total);
            rd1.Close();

            SqlCommand cmd = new SqlCommand();
            cmd.CommandText = "SELECT *FROM [Candidates]";
            cmd.Connection = con;
            SqlDataReader rd = cmd.ExecuteReader();
            table.Append("<table border='1'>");
            table.Append("<tr><th>Id</th> <th>Candidate Name</th> <th>CurrentVotes</th> <th>Percentage Votes</th>");
            table.Append("</tr>");
             
            if (rd.HasRows)
            {
                while (rd.Read())
                {
                    percent =Math.Round((100*(Convert.ToDouble(rd[2])) / total),2);
                    table.Append("<tr>");
                    table.Append("<td>" + rd[0] + "</td>");
                    table.Append("<td>" + rd[1] + "</td>");
                    table.Append("<td>" + rd[2] + "</td>");
                    table.Append("<td>" + percent + "</td>");
                    table.Append("</tr>");
                }
            }
            table.Append("</table>");
            PlaceHolder1.Controls.Add(new Literal { Text=table.ToString()});
            rd.Close();

        }
    }
}