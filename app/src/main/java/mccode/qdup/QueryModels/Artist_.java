
package mccode.qdup.QueryModels;

import java.util.HashMap;
import java.util.Map;

public class Artist_ {

    private External_urls__ external_urls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist_() {
    }

    /**
     * 
     * @param id
     * @param external_urls
     * @param name
     * @param type
     * @param uri
     * @param href
     */
    public Artist_(External_urls__ external_urls, String href, String id, String name, String type, String uri) {
        super();
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    public External_urls__ getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(External_urls__ external_urls) {
        this.external_urls = external_urls;
    }

    public Artist_ withExternal_urls(External_urls__ external_urls) {
        this.external_urls = external_urls;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Artist_ withHref(String href) {
        this.href = href;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Artist_ withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist_ withName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Artist_ withType(String type) {
        this.type = type;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Artist_ withUri(String uri) {
        this.uri = uri;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Artist_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
