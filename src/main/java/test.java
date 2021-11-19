import java.awt.*;
import java.util.Scanner;

/**
 * Project name(项目名称)：算法_选择排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/19
 * Time(创建时间)： 23:36
 * Version(版本): 1.0
 * Description(描述)：
 * 2, 8, 7, 1, 3, 5, 6, 4
 * <p>
 * 1 8 7 2 3 5 6 4
 * 1 2 8 7 3 5 6 4
 * 1 2 3 8 7 5 6 4
 * 1 2 3 4 8 7 6 5
 * 1 2 3 4 5 8 7 6
 * 1 2 3 4 5 6 8 7
 * 1 2 3 4 5 6 7 8
 */

public class test
{
    public static void main(String[] args)
    {
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        SelectionSort.sort(arr);
         */
        if (args.length == 0)
        {
            int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};
            SelectionSort.sort(arr);
        }
        else
        {
            int pos = 1;
            try
            {
                int[] arr = new int[args.length];
                for (int i = 0; i < args.length; i++)
                {
                    arr[i] = Integer.parseInt(args[i]);
                    pos++;
                }
                System.out.println("已传入参数");
                SelectionSort.sort(arr);
            }
            catch (NumberFormatException e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("格式转换错误！！！请检查第" + pos + "个元素");
            }
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("未知错误");
                e.printStackTrace();
            }
        }
    }
}
