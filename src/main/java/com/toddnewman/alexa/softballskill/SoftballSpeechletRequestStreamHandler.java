package com.toddnewman.alexa.softballskill;

import java.util.*;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/*
 * set lambda handler to
   package com.toddnewman.alexa.softballskill.SoftballSpeechletRequestStreamHandler
 */

public class SoftballSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        supportedApplicationIds.add("amzn1.ask.skill.6210f9cc-52b3-4035-8647-4b3aaca12bdb");
    }

    public SoftballSpeechletRequestStreamHandler() {
        super(new SoftballSpeechlet(), supportedApplicationIds);
    }

}
