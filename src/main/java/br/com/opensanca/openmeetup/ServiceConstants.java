package br.com.opensanca.openmeetup;

import java.time.format.DateTimeFormatter;

/**
 * Created by lferreira on 6/11/17.
 */
public final class ServiceConstants {
    private ServiceConstants() {
    }

    public static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m");
}
