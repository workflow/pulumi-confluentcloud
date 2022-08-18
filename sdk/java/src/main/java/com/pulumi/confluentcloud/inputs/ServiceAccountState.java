// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAccountState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountState Empty = new ServiceAccountState();

    /**
     * (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * A free-form description of the Service Account.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form description of the Service Account.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A human-readable name for the Service Account.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-readable name for the Service Account.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Required String) A kind of the Service Account, for example, `ServiceAccount`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return (Required String) A kind of the Service Account, for example, `ServiceAccount`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ServiceAccountState() {}

    private ServiceAccountState(ServiceAccountState $) {
        this.apiVersion = $.apiVersion;
        this.description = $.description;
        this.displayName = $.displayName;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountState $;

        public Builder() {
            $ = new ServiceAccountState();
        }

        public Builder(ServiceAccountState defaults) {
            $ = new ServiceAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param description A free-form description of the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form description of the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A human-readable name for the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Service Account.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param kind (Required String) A kind of the Service Account, for example, `ServiceAccount`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Required String) A kind of the Service Account, for example, `ServiceAccount`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ServiceAccountState build() {
            return $;
        }
    }

}