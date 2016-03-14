using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.IO;
public partial class anagram : System.Web.UI.Page
{
    List<string> duplicate = new List<string>();
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void calculate(object sender, EventArgs e)
    {
        String s = txt1.Text;
        ListBox1.Items.Clear();
        duplicate.Clear();
        if (s.Length > 8){
            Label2.Text = "Please enter a string from 1 to 8 characters";
        }
        else if (s.Length == 0){
            Label2.Text = "Please enter a string from 1 to 8 characters";
        }
        else {             
            perm(s);
        }

        txt1.Text = "";
    }
    protected void perm(string str)
    {
        perm("", str);
        foreach(String s1 in duplicate)
        {
            ListBox1.Items.Add(s1);
        }
        Label2.Text = duplicate.Count + " no of anagrams.";
    } 
    protected void perm(string pre,string str)
    {
        
        int len = str.Length;
        if (len == 0)
        {
            if (CheckBox1.Checked)
            {
                if (!duplicate.Contains(pre))
                {
                    duplicate.Add(pre);
                    
                }
            }
            else
            {
                duplicate.Add(pre);
                
            }

        }
        else
        {
            for(int i=0;i< len; i++)
            {
                perm(pre + str[i], str.Substring(0, i) + str.Substring(i + 1));
            }
        }
      
    }   
    




    protected void ListBox1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void CheckBox1_CheckedChanged(object sender, EventArgs e)
    {

    }
}