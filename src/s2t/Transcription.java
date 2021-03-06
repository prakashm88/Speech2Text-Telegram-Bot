package s2t;

import java.io.IOException;

public interface Transcription {
    /*
        Params: FileName - Il path relativo al file da trascrivere
        Return la stringa di risposta del servizio interrogato
     */
    String transcript(String fileName) throws IOException;

    /*
        Ritorna la stringa pulita della trascrizione
     */
    String getText();
}
