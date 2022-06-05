// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    /// <summary>
    /// ## Import
    /// 
    /// You can import a Peering by using Environment ID and Peering ID, in the format `&lt;Environment ID&gt;/&lt;Peering ID&gt;`. The following example shows how to import a Peering$ export CONFLUENT_CLOUD_API_KEY="&lt;cloud_api_key&gt;" $ export CONFLUENT_CLOUD_API_SECRET="&lt;cloud_api_secret&gt;"
    /// 
    /// ```sh
    ///  $ pulumi import confluentcloud:index/peering:Peering my_peer env-abc123/peer-abc123
    /// ```
    /// 
    ///  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
    /// </summary>
    [ConfluentCloudResourceType("confluentcloud:index/peering:Peering")]
    public partial class Peering : Pulumi.CustomResource
    {
        [Output("aws")]
        public Output<Outputs.PeeringAws?> Aws { get; private set; } = null!;

        [Output("azure")]
        public Output<Outputs.PeeringAzure?> Azure { get; private set; } = null!;

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Output("environment")]
        public Output<Outputs.PeeringEnvironment> Environment { get; private set; } = null!;

        [Output("gcp")]
        public Output<Outputs.PeeringGcp?> Gcp { get; private set; } = null!;

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Output("network")]
        public Output<Outputs.PeeringNetwork> Network { get; private set; } = null!;


        /// <summary>
        /// Create a Peering resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Peering(string name, PeeringArgs args, CustomResourceOptions? options = null)
            : base("confluentcloud:index/peering:Peering", name, args ?? new PeeringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Peering(string name, Input<string> id, PeeringState? state = null, CustomResourceOptions? options = null)
            : base("confluentcloud:index/peering:Peering", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Peering resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Peering Get(string name, Input<string> id, PeeringState? state = null, CustomResourceOptions? options = null)
        {
            return new Peering(name, id, state, options);
        }
    }

    public sealed class PeeringArgs : Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PeeringAwsArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PeeringAzureArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment", required: true)]
        public Input<Inputs.PeeringEnvironmentArgs> Environment { get; set; } = null!;

        [Input("gcp")]
        public Input<Inputs.PeeringGcpArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.PeeringNetworkArgs> Network { get; set; } = null!;

        public PeeringArgs()
        {
        }
    }

    public sealed class PeeringState : Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.PeeringAwsGetArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.PeeringAzureGetArgs>? Azure { get; set; }

        /// <summary>
        /// The name of the Peering.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.PeeringEnvironmentGetArgs>? Environment { get; set; }

        [Input("gcp")]
        public Input<Inputs.PeeringGcpGetArgs>? Gcp { get; set; }

        /// <summary>
        /// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
        /// accounts.
        /// </summary>
        [Input("network")]
        public Input<Inputs.PeeringNetworkGetArgs>? Network { get; set; }

        public PeeringState()
        {
        }
    }
}