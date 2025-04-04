package com.geoff;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

/**
 * Says "Hi" to the user.
 *
 */
@Mojo(name = "isVeryPolite")
public class PoliteMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException {
        try {
            String myLine = "Have a Jolly Good Day !";
            String asciiArt = FigletFont.convertOneLine(myLine);

            getLog().info("\n" + asciiArt);
            getLog().info("Hello, I wish you a jolly good day !");
        } catch (IOException e) {
            throw new MojoExecutionException("Error generating ASCII art", e);
        }
    }
}