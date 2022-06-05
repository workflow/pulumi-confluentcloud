// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetEnvironment
    {
        /// <summary>
        /// `confluentcloud.Environment` describes an Environment data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleUsingIdEnvironment = Output.Create(ConfluentCloud.GetEnvironment.InvokeAsync(new ConfluentCloud.GetEnvironmentArgs
        ///         {
        ///             Id = "env-abc123",
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdEnvironment;
        ///         var exampleUsingNameEnvironment = Output.Create(ConfluentCloud.GetEnvironment.InvokeAsync(new ConfluentCloud.GetEnvironmentArgs
        ///         {
        ///             DisplayName = "stag",
        ///         }));
        ///         var exampleUsingNameServiceAccount = Output.Create(ConfluentCloud.GetServiceAccount.InvokeAsync(new ConfluentCloud.GetServiceAccountArgs
        ///         {
        ///             DisplayName = "test_sa",
        ///         }));
        ///         var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new ConfluentCloud.RoleBindingArgs
        ///         {
        ///             Principal = exampleUsingNameServiceAccount.Apply(exampleUsingNameServiceAccount =&gt; $"User:{exampleUsingNameServiceAccount.Id}"),
        ///             RoleName = "EnvironmentAdmin",
        ///             CrnPattern = exampleUsingNameEnvironment.Apply(exampleUsingNameEnvironment =&gt; exampleUsingNameEnvironment.ResourceName),
        ///         });
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("confluentcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// `confluentcloud.Environment` describes an Environment data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var exampleUsingIdEnvironment = Output.Create(ConfluentCloud.GetEnvironment.InvokeAsync(new ConfluentCloud.GetEnvironmentArgs
        ///         {
        ///             Id = "env-abc123",
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdEnvironment;
        ///         var exampleUsingNameEnvironment = Output.Create(ConfluentCloud.GetEnvironment.InvokeAsync(new ConfluentCloud.GetEnvironmentArgs
        ///         {
        ///             DisplayName = "stag",
        ///         }));
        ///         var exampleUsingNameServiceAccount = Output.Create(ConfluentCloud.GetServiceAccount.InvokeAsync(new ConfluentCloud.GetServiceAccountArgs
        ///         {
        ///             DisplayName = "test_sa",
        ///         }));
        ///         var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new ConfluentCloud.RoleBindingArgs
        ///         {
        ///             Principal = exampleUsingNameServiceAccount.Apply(exampleUsingNameServiceAccount =&gt; $"User:{exampleUsingNameServiceAccount.Id}"),
        ///             RoleName = "EnvironmentAdmin",
        ///             CrnPattern = exampleUsingNameEnvironment.Apply(exampleUsingNameEnvironment =&gt; exampleUsingNameEnvironment.ResourceName),
        ///         });
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("confluentcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Environment.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetEnvironmentArgs()
        {
        }
    }

    public sealed class GetEnvironmentInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A human-readable name for the Environment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetEnvironmentInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        /// <summary>
        /// (Required String) A human-readable name for the Environment.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required String) The ID of the Environment, for example, `env-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
        /// </summary>
        public readonly string ResourceName;

        [OutputConstructor]
        private GetEnvironmentResult(
            string displayName,

            string id,

            string resourceName)
        {
            DisplayName = displayName;
            Id = id;
            ResourceName = resourceName;
        }
    }
}
