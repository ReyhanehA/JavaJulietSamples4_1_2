/*
* @description Incorrect Block Delimitation
*
* */

package testcases.CWE483_Incorrect_Block_Delimitation;

import testcasesupport.*;

import java.security.SecureRandom;

public class CWE483_Incorrect_Block_Delimitation__if_without_braces_single_line_01 extends AbstractTestCase
{

    public void bad() throws Throwable
    {

        int x;
        int y;

        SecureRandom rand = SecureRandom.getInstance("SHA1PRNG");
        x = (rand.nextInt() % 3);

        y = 0;

        /* FLAW: forgot to put these two statements within braces
         * (on the same line)
         */
        if (x == 0) IO.writeLine("x == 0"); y = 1;

        if (y == 1) IO.writeLine("x was 0\n");

    }

    public void good() throws Throwable
    {
        good1();
    }

    private void good1() throws Throwable
    {

        int x;
        int y;

        SecureRandom rand = SecureRandom.getInstance("SHA1PRNG");
        x = (rand.nextInt() % 3);

        y = 0;

        /* FIX: put the related statements within braces */
        if (x == 0) { IO.writeLine("x == 0"); y = 1; }

        if (y == 1) IO.writeLine("x was 0\n");

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
