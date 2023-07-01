/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE477_Obsolete_Functions__URLEncoder_encodeServlet_04.java
Label Definition File: CWE477_Obsolete_Functions.label.xml
Template File: point-flaw-04.tmpl.java
*/
/*
* @description
* CWE: 477 Use of Obsolete Functions
* Sinks: URLEncoder_encodeServlet
*    GoodSink: Use of prefered java.net.URLEncoder.encode(String, String)
*    BadSink : Use of deprecated java.net.URLEncoder.encode(String)
* Flow Variant: 04 Control flow: if(private_final_t) and if(private_final_f)
*
* */

package testcases.CWE477_Obsolete_Functions;

import testcasesupport.*;

import java.net.*;
import java.text.*;
import java.util.*;
import java.io.*;
import javax.servlet.http.*;

public class CWE477_Obsolete_Functions__URLEncoder_encodeServlet_04 extends AbstractTestCaseServlet
{

    /* The two variables below are declared "final", so a tool should
       be able to identify that reads of these will always return their
       initialized values. */
    private final boolean private_final_t = true;
    private final boolean private_final_f = false;

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (private_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FLAW: Use of deprecated URLEncoder.encode(String s) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FIX: Use prefered URLEncoder.encode(String s, String encoding) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }

        }
    }

    /* good1() changes private_final_t to private_final_f */
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if(private_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FLAW: Use of deprecated URLEncoder.encode(String s) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }
        }
        else {

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FIX: Use prefered URLEncoder.encode(String s, String encoding) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if(private_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FIX: Use prefered URLEncoder.encode(String s, String encoding) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()", "UTF-8"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            PrintWriter out = null;
            try
            {
                out = response.getWriter();
                /* FLAW: Use of deprecated URLEncoder.encode(String s) method */
                out.println(java.net.URLEncoder.encode("abc|1 $#@<><()"));
            }
            catch( Exception e )
            {
                log2.warning("Error writing");
            }
            finally
            {
                if( out != null )
                {
                    out.close();
                }
            }

        }

    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        good1(request, response);
        good2(request, response);
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}