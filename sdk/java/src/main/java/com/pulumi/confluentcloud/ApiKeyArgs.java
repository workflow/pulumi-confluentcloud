// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.ApiKeyManagedResourceArgs;
import com.pulumi.confluentcloud.inputs.ApiKeyOwnerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * A free-form description of the API Account.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A free-form description of the API Account.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     * 
     */
    @Import(name="disableWaitForReady")
    private @Nullable Output<Boolean> disableWaitForReady;

    /**
     * @return An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableWaitForReady() {
        return Optional.ofNullable(this.disableWaitForReady);
    }

    /**
     * A human-readable name for the API Key.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-readable name for the API Key.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
     * 
     */
    @Import(name="managedResource")
    private @Nullable Output<ApiKeyManagedResourceArgs> managedResource;

    /**
     * @return The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
     * 
     */
    public Optional<Output<ApiKeyManagedResourceArgs>> managedResource() {
        return Optional.ofNullable(this.managedResource);
    }

    /**
     * The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
     * 
     */
    @Import(name="owner", required=true)
    private Output<ApiKeyOwnerArgs> owner;

    /**
     * @return The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
     * 
     */
    public Output<ApiKeyOwnerArgs> owner() {
        return this.owner;
    }

    private ApiKeyArgs() {}

    private ApiKeyArgs(ApiKeyArgs $) {
        this.description = $.description;
        this.disableWaitForReady = $.disableWaitForReady;
        this.displayName = $.displayName;
        this.managedResource = $.managedResource;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyArgs $;

        public Builder() {
            $ = new ApiKeyArgs();
        }

        public Builder(ApiKeyArgs defaults) {
            $ = new ApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A free-form description of the API Account.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A free-form description of the API Account.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disableWaitForReady An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableWaitForReady(@Nullable Output<Boolean> disableWaitForReady) {
            $.disableWaitForReady = disableWaitForReady;
            return this;
        }

        /**
         * @param disableWaitForReady An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableWaitForReady(Boolean disableWaitForReady) {
            return disableWaitForReady(Output.of(disableWaitForReady));
        }

        /**
         * @param displayName A human-readable name for the API Key.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the API Key.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param managedResource The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
         * 
         * @return builder
         * 
         */
        public Builder managedResource(@Nullable Output<ApiKeyManagedResourceArgs> managedResource) {
            $.managedResource = managedResource;
            return this;
        }

        /**
         * @param managedResource The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
         * 
         * @return builder
         * 
         */
        public Builder managedResource(ApiKeyManagedResourceArgs managedResource) {
            return managedResource(Output.of(managedResource));
        }

        /**
         * @param owner The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
         * 
         * @return builder
         * 
         */
        public Builder owner(Output<ApiKeyOwnerArgs> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
         * 
         * @return builder
         * 
         */
        public Builder owner(ApiKeyOwnerArgs owner) {
            return owner(Output.of(owner));
        }

        public ApiKeyArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}
