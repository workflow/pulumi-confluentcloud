// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetUser
    {
        /// <summary>
        /// `confluentcloud.getUser` describes a User data source.
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
        ///         var exampleUsingIdUser = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             Id = "u-abc123",
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdUser;
        ///         var exampleUsingEmail = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             Email = "test123@gmail.com",
        ///         }));
        ///         var test_env = new ConfluentCloud.Environment("test-env", new ConfluentCloud.EnvironmentArgs
        ///         {
        ///             DisplayName = exampleUsingIdUser.Apply(exampleUsingIdUser =&gt; $"env_for_{exampleUsingIdUser.FullName}"),
        ///         });
        ///         var standard_cluster_on_aws = new ConfluentCloud.KafkaCluster("standard-cluster-on-aws", new ConfluentCloud.KafkaClusterArgs
        ///         {
        ///             DisplayName = "standard_kafka_cluster_on_aws",
        ///             Availability = "SINGLE_ZONE",
        ///             Cloud = "AWS",
        ///             Region = "us-west-2",
        ///             Standards = 
        ///             {
        ///                 ,
        ///             },
        ///             Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
        ///             {
        ///                 Id = test_env.Id,
        ///             },
        ///         });
        ///         var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new ConfluentCloud.RoleBindingArgs
        ///         {
        ///             Principal = exampleUsingEmail.Apply(exampleUsingEmail =&gt; $"User:{exampleUsingEmail.Id}"),
        ///             RoleName = "CloudClusterAdmin",
        ///             CrnPattern = standard_cluster_on_aws.RbacCrn,
        ///         });
        ///         var exampleUsingFullName = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             FullName = "John Doe",
        ///         }));
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("confluentcloud:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// `confluentcloud.getUser` describes a User data source.
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
        ///         var exampleUsingIdUser = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             Id = "u-abc123",
        ///         }));
        ///         this.ExampleUsingId = exampleUsingIdUser;
        ///         var exampleUsingEmail = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             Email = "test123@gmail.com",
        ///         }));
        ///         var test_env = new ConfluentCloud.Environment("test-env", new ConfluentCloud.EnvironmentArgs
        ///         {
        ///             DisplayName = exampleUsingIdUser.Apply(exampleUsingIdUser =&gt; $"env_for_{exampleUsingIdUser.FullName}"),
        ///         });
        ///         var standard_cluster_on_aws = new ConfluentCloud.KafkaCluster("standard-cluster-on-aws", new ConfluentCloud.KafkaClusterArgs
        ///         {
        ///             DisplayName = "standard_kafka_cluster_on_aws",
        ///             Availability = "SINGLE_ZONE",
        ///             Cloud = "AWS",
        ///             Region = "us-west-2",
        ///             Standards = 
        ///             {
        ///                 ,
        ///             },
        ///             Environment = new ConfluentCloud.Inputs.KafkaClusterEnvironmentArgs
        ///             {
        ///                 Id = test_env.Id,
        ///             },
        ///         });
        ///         var test_role_binding = new ConfluentCloud.RoleBinding("test-role-binding", new ConfluentCloud.RoleBindingArgs
        ///         {
        ///             Principal = exampleUsingEmail.Apply(exampleUsingEmail =&gt; $"User:{exampleUsingEmail.Id}"),
        ///             RoleName = "CloudClusterAdmin",
        ///             CrnPattern = standard_cluster_on_aws.RbacCrn,
        ///         });
        ///         var exampleUsingFullName = Output.Create(ConfluentCloud.GetUser.InvokeAsync(new ConfluentCloud.GetUserArgs
        ///         {
        ///             FullName = "John Doe",
        ///         }));
        ///     }
        /// 
        ///     [Output("exampleUsingId")]
        ///     public Output&lt;string&gt; ExampleUsingId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetUserResult>("confluentcloud:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email address of the User.
        /// </summary>
        [Input("email")]
        public string? Email { get; set; }

        /// <summary>
        /// The full name of the User.
        /// </summary>
        [Input("fullName")]
        public string? FullName { get; set; }

        /// <summary>
        /// The ID of the User (e.g., `u-abc123`).
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetUserArgs()
        {
        }
    }

    public sealed class GetUserInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email address of the User.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The full name of the User.
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// The ID of the User (e.g., `u-abc123`).
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetUserInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the User.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The email address of the User.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// (Required String) The full name of the User.
        /// </summary>
        public readonly string FullName;
        /// <summary>
        /// (Required String) The ID of the User, for example, `u-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A kind of the User.
        /// </summary>
        public readonly string Kind;

        [OutputConstructor]
        private GetUserResult(
            string apiVersion,

            string email,

            string fullName,

            string id,

            string kind)
        {
            ApiVersion = apiVersion;
            Email = email;
            FullName = fullName;
            Id = id;
            Kind = kind;
        }
    }
}
