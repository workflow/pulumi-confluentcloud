// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetNetwork
    {
        /// <summary>
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.Network` describes a Network data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         Id = "n-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         Description = $"test_sa for {exampleUsingId.Apply(getNetworkResult =&gt; getNetworkResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingNameNetwork = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         DisplayName = "my_network",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingNameNetwork.Apply(getNetworkResult =&gt; getNetworkResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkResult> InvokeAsync(GetNetworkArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkResult>("confluentcloud:index/getNetwork:getNetwork", args ?? new GetNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// &lt;img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt=""&gt;
        /// 
        /// `confluentcloud.Network` describes a Network data source.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleUsingId = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         Id = "n-abc123",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     var test_sa = new ConfluentCloud.ServiceAccount("test-sa", new()
        ///     {
        ///         Description = $"test_sa for {exampleUsingId.Apply(getNetworkResult =&gt; getNetworkResult.DisplayName)}",
        ///     });
        /// 
        ///     var exampleUsingNameNetwork = ConfluentCloud.GetNetwork.Invoke(new()
        ///     {
        ///         DisplayName = "my_network",
        ///         Environment = new ConfluentCloud.Inputs.GetNetworkEnvironmentInputArgs
        ///         {
        ///             Id = "env-xyz456",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["exampleUsingName"] = exampleUsingNameNetwork.Apply(getNetworkResult =&gt; getNetworkResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkResult> Invoke(GetNetworkInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetNetworkResult>("confluentcloud:index/getNetwork:getNetwork", args ?? new GetNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkArgs : global::Pulumi.InvokeArgs
    {
        [Input("aws")]
        private List<Inputs.GetNetworkAwArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkAwArgs> Aws
        {
            get => _aws ?? (_aws = new List<Inputs.GetNetworkAwArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private List<Inputs.GetNetworkAzureArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkAzureArgs> Azures
        {
            get => _azures ?? (_azures = new List<Inputs.GetNetworkAzureArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// A human-readable name for the Network.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Inputs.GetNetworkEnvironmentArgs Environment { get; set; } = null!;

        [Input("gcps")]
        private List<Inputs.GetNetworkGcpArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public List<Inputs.GetNetworkGcpArgs> Gcps
        {
            get => _gcps ?? (_gcps = new List<Inputs.GetNetworkGcpArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The ID of the Environment that the Network belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetNetworkArgs()
        {
        }
        public static new GetNetworkArgs Empty => new GetNetworkArgs();
    }

    public sealed class GetNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("aws")]
        private InputList<Inputs.GetNetworkAwInputArgs>? _aws;

        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkAwInputArgs> Aws
        {
            get => _aws ?? (_aws = new InputList<Inputs.GetNetworkAwInputArgs>());
            set => _aws = value;
        }

        [Input("azures")]
        private InputList<Inputs.GetNetworkAzureInputArgs>? _azures;

        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkAzureInputArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.GetNetworkAzureInputArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// A human-readable name for the Network.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("environment", required: true)]
        public Input<Inputs.GetNetworkEnvironmentInputArgs> Environment { get; set; } = null!;

        [Input("gcps")]
        private InputList<Inputs.GetNetworkGcpInputArgs>? _gcps;

        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public InputList<Inputs.GetNetworkGcpInputArgs> Gcps
        {
            get => _gcps ?? (_gcps = new InputList<Inputs.GetNetworkGcpInputArgs>());
            set => _gcps = value;
        }

        /// <summary>
        /// The ID of the Environment that the Network belongs to, for example, `env-xyz456`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetNetworkInvokeArgs()
        {
        }
        public static new GetNetworkInvokeArgs Empty => new GetNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkResult
    {
        /// <summary>
        /// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkAwResult> Aws;
        /// <summary>
        /// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkAzureResult> Azures;
        /// <summary>
        /// (Required String) The IPv4 CIDR block to used for the network. Must be `/16`. Required for VPC peering and AWS TransitGateway.
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
        /// </summary>
        public readonly string Cloud;
        /// <summary>
        /// (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
        /// </summary>
        public readonly ImmutableArray<string> ConnectionTypes;
        /// <summary>
        /// (Required String) The name of the Network.
        /// </summary>
        public readonly string DisplayName;
        public readonly string DnsDomain;
        public readonly Outputs.GetNetworkEnvironmentResult Environment;
        /// <summary>
        /// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkGcpResult> Gcps;
        /// <summary>
        /// (Required String) The ID of the Network, for example, `n-abc123`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) The cloud provider region where the network exists.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Network.
        /// </summary>
        public readonly string ResourceName;
        public readonly ImmutableDictionary<string, string> ZonalSubdomains;
        /// <summary>
        /// (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
        /// used with Private Link. Otherwise, they are automatically chosen by Confluent Cloud.
        /// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
        /// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
        /// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetNetworkResult(
            ImmutableArray<Outputs.GetNetworkAwResult> aws,

            ImmutableArray<Outputs.GetNetworkAzureResult> azures,

            string cidr,

            string cloud,

            ImmutableArray<string> connectionTypes,

            string displayName,

            string dnsDomain,

            Outputs.GetNetworkEnvironmentResult environment,

            ImmutableArray<Outputs.GetNetworkGcpResult> gcps,

            string id,

            string region,

            string resourceName,

            ImmutableDictionary<string, string> zonalSubdomains,

            ImmutableArray<string> zones)
        {
            Aws = aws;
            Azures = azures;
            Cidr = cidr;
            Cloud = cloud;
            ConnectionTypes = connectionTypes;
            DisplayName = displayName;
            DnsDomain = dnsDomain;
            Environment = environment;
            Gcps = gcps;
            Id = id;
            Region = region;
            ResourceName = resourceName;
            ZonalSubdomains = zonalSubdomains;
            Zones = zones;
        }
    }
}
