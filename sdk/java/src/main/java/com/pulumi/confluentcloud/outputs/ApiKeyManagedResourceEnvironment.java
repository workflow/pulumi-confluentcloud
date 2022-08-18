// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiKeyManagedResourceEnvironment {
    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private ApiKeyManagedResourceEnvironment(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyManagedResourceEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyManagedResourceEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public ApiKeyManagedResourceEnvironment build() {
            return new ApiKeyManagedResourceEnvironment(id);
        }
    }
}