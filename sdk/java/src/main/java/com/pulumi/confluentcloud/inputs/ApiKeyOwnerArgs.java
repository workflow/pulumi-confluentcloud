// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiKeyOwnerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyOwnerArgs Empty = new ApiKeyOwnerArgs();

    /**
     * The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     * 
     */
    @Import(name="apiVersion", required=true)
    private Output<String> apiVersion;

    /**
     * @return The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }

    /**
     * The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    private ApiKeyOwnerArgs() {}

    private ApiKeyOwnerArgs(ApiKeyOwnerArgs $) {
        this.apiVersion = $.apiVersion;
        this.id = $.id;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyOwnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyOwnerArgs $;

        public Builder() {
            $ = new ApiKeyOwnerArgs();
        }

        public Builder(ApiKeyOwnerArgs defaults) {
            $ = new ApiKeyOwnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param id The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kind The kind of the managed resource that the API Key associated with, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the managed resource that the API Key associated with, for example, `Cluster`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ApiKeyOwnerArgs build() {
            $.apiVersion = Objects.requireNonNull($.apiVersion, "expected parameter 'apiVersion' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
