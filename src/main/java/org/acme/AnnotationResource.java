package org.acme;

import java.lang.annotation.Annotation;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.jboss.logging.Logger;

@Path("/annotations")
@ApplicationScoped
public class AnnotationResource {

    private static final Logger LOG = Logger.getLogger(AnnotationResource.class);

    @GET
    public void annotations() {
        for (Annotation annotation : getClass().getAnnotations()) {
            LOG.info(annotation);
        }
    }
}
