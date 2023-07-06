def get_changed_files(folder_path, old_sha, new_sha):
    temp=[]
    url = f"base_url}/repos/{repo_owner}/{repo_name}/cmpare/{old_sha}...{new_sha}"
    print(url)
    params = {
        "path": folder_path
    }
    response = requests.get(url, headers=headers, params=params)
    print(response)
    if response.status_code == 200:
        comparison = response.json()
        if "files" in comparison:
            files = comparison["files"]
            changed_files = [file["filename"] for file in files]
            print(changed_files,"changed_files")
            print(folder_path,"Folder_path")
            for i in changed_files:
                if folder_path in i:
                    print(i)

                    temp.append(i)

            print(temp,"changed_files")        
            return temp
    return []
