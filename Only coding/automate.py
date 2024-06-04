import subprocess

def run_terraform(command):
    process = subprocess.Popen(["terraform", command], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    output, err = process.communicate()
    if err:
        print(f"Error running Terraform {command}: {err.decode()}")
    else:
        print(f"Terraform {command} output:\n{output.decode()}")

# Initialize Terraform (optional, if not done manually)
# run_terraform("init")

# Plan the infrastructure changes
run_terraform("plan")

# Apply the changes (confirm manually before running)
user_confirmation = input("Apply changes to AWS (y/N)? ")
if user_confirmation.lower() == "y":
    run_terraform("apply")
else:
    print("Aborting...")