 /**
 * @author Soorya Siju
 * @version 5.0
 **/
public class OOPSBannerApp{

    public static void main(String[] args) {

        // Create array with 7 banner lines
        String[] lines= {
        String.join(" ", "   ***   ", "   ***   ", "******   ", "  *****  "),
        String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      "),
        String.join(" ", "**     **", "**     **", "**     **", "**       "),
        String.join(" ", "**     **", "**     **", "**    ** ", "  *****  "),
        String.join(" ", "**     **", "**     **", "******   ", "      ** "),
        String.join(" ", " **   ** ", " **   ** ", "**       ", " **   ** "),
        String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  ")};

        // Use enhanced for-loop to print
        for (String line : lines) {
            System.out.println(line); 
        }
	}
}
