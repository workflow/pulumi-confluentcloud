// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class KafkaClusterDedicatedGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
        /// </summary>
        [Input("cku", required: true)]
        public Input<int> Cku { get; set; } = null!;

        /// <summary>
        /// The ID of the encryption key that is used to encrypt the data in the Kafka cluster, for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` (key Amazon Resource Name) for AWS or `projects/my-test-project/locations/global/keyRings/test-byok/cryptoKeys/test` for GCP. Append required permissions to the key policy before creating a Kafka cluster, see [Encrypt Confluent Cloud Clusters using Self-Managed Keys](https://docs.confluent.io/cloud/current/clusters/byok/index.html) for more details. At the moment, self-managed encryption keys are only available for the Dedicated clusters on AWS or GCP.
        /// </summary>
        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        public KafkaClusterDedicatedGetArgs()
        {
        }
    }
}
