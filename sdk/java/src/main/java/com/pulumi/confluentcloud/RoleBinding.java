// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.RoleBindingArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.RoleBindingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Role Binding by using Role Binding ID, for example$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/roleBinding:RoleBinding my_rb rb-f3a90de
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/roleBinding:RoleBinding")
public class RoleBinding extends com.pulumi.resources.CustomResource {
    /**
     * A [Confluent Resource Name(CRN)](&lt;https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)&gt;) that specifies the scope and resource patterns necessary for the role to bind.
     * 
     */
    @Export(name="crnPattern", type=String.class, parameters={})
    private Output<String> crnPattern;

    /**
     * @return A [Confluent Resource Name(CRN)](&lt;https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)&gt;) that specifies the scope and resource patterns necessary for the role to bind.
     * 
     */
    public Output<String> crnPattern() {
        return this.crnPattern;
    }
    /**
     * A principal User to bind the role to, for example, &#34;User:u-111aaa&#34; for binding to a user &#34;u-111aaa&#34;, or &#34;User:sa-111aaa&#34; for binding to a service account &#34;sa-111aaa&#34;.
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return A principal User to bind the role to, for example, &#34;User:u-111aaa&#34; for binding to a user &#34;u-111aaa&#34;, or &#34;User:sa-111aaa&#34; for binding to a service account &#34;sa-111aaa&#34;.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     * 
     */
    @Export(name="roleName", type=String.class, parameters={})
    private Output<String> roleName;

    /**
     * @return A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleBinding(String name) {
        this(name, RoleBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleBinding(String name, RoleBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleBinding(String name, RoleBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/roleBinding:RoleBinding", name, args == null ? RoleBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleBinding(String name, Output<String> id, @Nullable RoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/roleBinding:RoleBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RoleBinding get(String name, Output<String> id, @Nullable RoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleBinding(name, id, state, options);
    }
}
