import javax.swing.JOptionPane;

public class popup extends javax.swing.JFrame {

    public static void main(String[] args) {
        popup app = new popup();
        app.rummikubInvitation(null);
    }

    private void rummikubInvitation(java.awt.event.ActionEvent event) {
        int response = JOptionPane.showConfirmDialog(null,"You have been invited to play Rummikub!!! \n Will you accept?", "Rummikub Invitation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            invitationAccepted();
        }
        else {
            invitationNotAccepted();
        }
    }

    private void invitationAccepted() {
        JOptionPane.showMessageDialog(null, "YAYYY!!! ◝ ( ᵔᵕᵔ ) ◜", "Rummikub Invitation", JOptionPane.INFORMATION_MESSAGE);
        RummikubLink();
    }

    private void invitationNotAccepted() {
        int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Rummikub Invitation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            robot();
        }
        else {
            confirmation();
        }
    }

    private void robot() {
        int response = JOptionPane.showConfirmDialog(null, "Are you a robot?", "Are you a robot?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            idk();
            // JOptionPane.showMessageDialog(null,"Robot, I command you to install Rummikub.", "ROBOT?????", JOptionPane.INFORMATION_MESSAGE);
            // RummikubLink();
        }
        else {
            feelings();
        }
    }

    private void idk(){
        int res = JOptionPane.showConfirmDialog(null, "Robot, I command you to install Rummikub.", "ROBOT?????", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            install();
        } else {
            Object[] options = {"WHAT"};
            JOptionPane.showOptionDialog(null, "ah the illusion of choice", "HAHAHAHAHAHHAHAHA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            install();
        }
    }

    private void confirmation() {
        int response = JOptionPane.showConfirmDialog(null, "so, we're playing Rummikub?", "Rummikub Invitation", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION) {
            invitationAccepted();
        } else {
            robot();
        }
    }

    private void feelings() {
        Object[] options = {"Yes"};
        JOptionPane.showOptionDialog(null, "so you have feelings?", "Do you have feelings", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        confirmation2();
    }

    private void confirmation2() {
        int response = JOptionPane.showConfirmDialog(null, "then play Rummikub with me ( •̯́ ₃ •̯̀)", "Rummikub Invitation", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION) {
            invitationAccepted();
        } else {
            JOptionPane.showMessageDialog(null, "( ╯ '□' )╯︵ ┻━┻", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            hacking();
        }
    }

    private void hacking() {
        for(int i = 0; i < 3; i++)
            JOptionPane.showMessageDialog(null, "YOU HAVE BEEN HACKED.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        install();
    }

    private void install() {
        JOptionPane.showMessageDialog(null, "Installing Rummikub...   ⌛\uFE0E ", "Installation in Progress", JOptionPane.INFORMATION_MESSAGE);
        RummikubLink();
    }

    private void RummikubLink() {
        try {
            String url = "https://apps.microsoft.com/detail/9wzdncrfjccw?hl";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}